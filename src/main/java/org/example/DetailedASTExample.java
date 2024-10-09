package org.example;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DetailedASTExample {
    private static final String PATH = "src/main/java/org/example/sample/Hello.java";

    /**
     * That is the main entry point of program.
     * That will be reading a Java source file, parses it, and processes all classes founded in the file.
     *
     * @param args args Command line arguments (not used in this implementation)
     * @throws IOException If there's an error reading the source file
     */
    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));

        List<ClassOrInterfaceDeclaration> classes = cu.findAll(ClassOrInterfaceDeclaration.class);
        for (ClassOrInterfaceDeclaration classDeclaration : classes) {
            processClass(classDeclaration);
        }
    }

    /**
     * This method process a single class declaration.
     * That will print the class name and will process all methods on the class.
     *
     * @param classDeclaration The ClassOrInterfaceDeclaration object representing the class.
     */
    private static void processClass(ClassOrInterfaceDeclaration classDeclaration) {
        System.out.println("Class name: " + classDeclaration.getName());
        System.out.println("=======================================================");

        List<MethodDeclaration> methods = classDeclaration.findAll(MethodDeclaration.class);
        for (MethodDeclaration methodDeclaration : methods) {
            processMethod(methodDeclaration, 6);
        }
    }

    /**
     * This method process a single method declaration.
     * That analyzes the parameters, variables, statements and will check for unused variables as a example and method length.
     *
     * @param methodDeclaration The MethodDeclaration object that is representing the method.
     * @param maxLines          This is the max lines number of lines allowed for the method.
     */
    private static void processMethod(MethodDeclaration methodDeclaration, int maxLines) {
        System.out.println("Method: " + methodDeclaration.getName() + " is a " + methodDeclaration.getType() + " method");

        processParameters(methodDeclaration);

        Set<String> declaredVariables = processDeclaredVariables(methodDeclaration);
        Set<String> usedVariables = processUsedVariables(methodDeclaration);

        processStatements(methodDeclaration);
        detectUnusedVariables(declaredVariables, usedVariables);
        checkMethodLineCount(methodDeclaration, maxLines);

        System.out.println("=======================================================");
    }

    /**
     * This method checks if the method exceeds the specified maximum number of lines of method.
     * If exceeds, a warning message is showed.
     *
     * @param method   The MethodDeclaration object to check.
     * @param maxLines This is the max lines number of lines allowed for the method.
     */
    private static void checkMethodLineCount(MethodDeclaration method, int maxLines) {
        int startLine = method.getBegin().get().line + 1;
        int endLine = method.getEnd().get().line;
        int lineCount = endLine - startLine;

        if (lineCount > maxLines) {
            System.out.println("Method " + method.getName() + " has " + lineCount + " lines code and limit is: " + maxLines);
        }
    }

    /**
     * This method will process and then will show information about parameters of the method.
     *
     * @param methodDeclaration The MethodDeclaration object that contain the parameters to process.
     */
    private static void processParameters(MethodDeclaration methodDeclaration) {
        for (Parameter parameter : methodDeclaration.getParameters()) {
            System.out.println("Parameter: " + parameter.getNameAsString() + " as type " + parameter.getType());
        }
    }

    /**
     * This method will process and collects all variables declared into method.
     *
     * @param methodDeclaration The MethodDeclaration object to process.
     * @return A set of strings where is containing the names of all declared variables.
     */
    private static Set<String> processDeclaredVariables(MethodDeclaration methodDeclaration) {
        Set<String> declaredVariables = new HashSet<>();
        List<VariableDeclarationExpr> variableDeclarations = methodDeclaration.findAll(VariableDeclarationExpr.class);
        for (VariableDeclarationExpr variableDeclarator : variableDeclarations) {
            for (VariableDeclarator var : variableDeclarator.getVariables()) {
                System.out.println("Variable: " + var.getNameAsString() + " as type " + variableDeclarator.getElementType());
                declaredVariables.add(var.getNameAsString());
            }
        }

        return declaredVariables;
    }

    /**
     * This method is processing all variables that is used into method.
     *
     * @param methodDeclaration The MethodDeclaration object that will process.
     * @return A set of string where is containing the names of all variables used.
     */
    private static Set<String> processUsedVariables(MethodDeclaration methodDeclaration) {
        Set<String> usedVariables = new HashSet<>();
        List<NameExpr> expressions = methodDeclaration.findAll(NameExpr.class);
        for (NameExpr expr : expressions) {
            String variableName = expr.getNameAsString();
            usedVariables.add(variableName);
        }
        return usedVariables;
    }

    /**
     * This method shows all statements of the method.
     *
     * @param methodDeclaration The MethodDeclaration object that contains the statement to process.
     */
    private static void processStatements(MethodDeclaration methodDeclaration) {
        if (methodDeclaration.getBody().isPresent()) {
            List<Statement> statements = methodDeclaration.getBody().get().getStatements();
            for (Statement statement : statements) {
                System.out.println("Sentences: " + statement);
            }
        }
    }

    /**
     * This method will detect and will show warning errors when a variable is not used in the method.
     *
     * @param declaredVariables A set of strings where is containing the names of all declared variables.
     * @param usedVariables     A set of string where is containing the names of all variables used.
     */
    private static void detectUnusedVariables(Set<String> declaredVariables, Set<String> usedVariables) {
        for (String variable : declaredVariables) {
            if (!usedVariables.contains(variable)) {
                System.out.println("Warning: Variable '" + variable + "' is declared but never used.");
            }
        }
    }
}
