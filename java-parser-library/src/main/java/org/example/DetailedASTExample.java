package org.example;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.MethodCallExpr;
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
    private static final String PATH = "java-parser-library/src/main/java/org/example/sample/Hello.java";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";

    /**
     * That is the main entry point of program.
     * That will be reading a Java source file, parses it, and processes all classes founded in the file.
     *
     * @param args args Command line arguments (not used in this implementation)
     * @throws IOException If there's an error reading the source file
     */
    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));
        detectExternalLibraries(cu);

        List<ClassOrInterfaceDeclaration> classes = cu.findAll(ClassOrInterfaceDeclaration.class);
        for (ClassOrInterfaceDeclaration classDeclaration : classes) {
            processClass(classDeclaration);
        }
    }

    /**
     * This method detects and shows all external libraries used different to java.
     * @param cu The CompilationUnit root to analyze the libraries used.
     */
    private static void detectExternalLibraries(CompilationUnit cu) {
        System.out.println(ANSI_BLUE + "═════════════════════════════════════════════════════" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "External libraries using:" + ANSI_RESET);
        Set<String> externalLibraries = new HashSet<>();

        for (ImportDeclaration importDecl : cu.getImports()) {
            String importName = importDecl.getName().asString();
            if (!importName.startsWith("java.")) {
                externalLibraries.add(importName);
            }
        }

        for (String library : externalLibraries) {
            System.out.println("\t- " + library);
        }
        System.out.println(ANSI_BLUE + "═════════════════════════════════════════════════════" + ANSI_RESET);
    }

    /**
     * This method process a single class declaration.
     * That will print the class name and will process all methods on the class.
     *
     * @param classDeclaration The ClassOrInterfaceDeclaration object representing the class.
     */
    private static void processClass(ClassOrInterfaceDeclaration classDeclaration) {
        System.out.println(ANSI_GREEN + "Class name: " + classDeclaration.getName() + ANSI_RESET);
        System.out.println(ANSI_BLUE + "═════════════════════════════════════════════════════" + ANSI_RESET);

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
        System.out.println(ANSI_YELLOW + "Method name is " + methodDeclaration.getName() + " and type is " + methodDeclaration.getType() + ANSI_RESET);

        processParameters(methodDeclaration, 4);

        Set<String> declaredVariables = processDeclaredVariables(methodDeclaration);
        Set<String> usedVariables = processUsedVariables(methodDeclaration);

        processStatements(methodDeclaration);
        detectUnusedVariables(declaredVariables, usedVariables);
        checkMethodLineCount(methodDeclaration, maxLines);
        detectMethodCalls(methodDeclaration);

        System.out.println(ANSI_BLUE + "─────────────────────────────────────────────────────" + ANSI_RESET);
    }

    /**
     * This method will detect all methods that is calling in method.
     * @param methodDeclaration The MethodDeclaration object that is representing the method.
     */
    private static void detectMethodCalls(MethodDeclaration methodDeclaration) {
        List<MethodCallExpr> methodCalls = methodDeclaration.findAll(MethodCallExpr.class);
        System.out.println(ANSI_GREEN + "\tMethod calls in " + methodDeclaration.getName() + ":" + ANSI_RESET);
        if (methodCalls.isEmpty()) {
            System.out.println("\t\t- No methods called here");
        } else {
            for (MethodCallExpr call : methodCalls) {
                System.out.println("\t\t- " + call.getName());
            }
        }
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
            System.out.println(ANSI_RED + "\t\t-> Method " + method.getName() + " has " + lineCount + " lines of code an the limit os: " + maxLines + ANSI_RESET);
        }
    }

    /**
     * This method will process and then will show information about parameters of the method.
     *
     * @param methodDeclaration The MethodDeclaration object that contain the parameters to process.
     */
    private static void processParameters(MethodDeclaration methodDeclaration, int maxParams) {
        List<Parameter> parameters = methodDeclaration.getParameters();
        System.out.println(ANSI_GREEN + "\tParameters:" + ANSI_RESET);

        if (parameters.isEmpty()) {
            System.out.println("\t\t- No parameters in this method");
        } else {
            for (Parameter parameter : parameters) {
                System.out.println("\t\t- " + parameter.getNameAsString() + " of type " + parameter.getType());
            }

            if (parameters.size() > maxParams) {
                System.out.println(ANSI_RED + "\t\t-> Method has " + parameters.size() + " parameters an the limit is " + maxParams + ANSI_RESET);
            }
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

        System.out.println(ANSI_GREEN + "\tVariables declared:" + ANSI_RESET);
        if (variableDeclarations.isEmpty()) {
            System.out.println("\t\t- No variable declared");
        } else {
            for (VariableDeclarationExpr variableDeclarator : variableDeclarations) {
                for (VariableDeclarator var : variableDeclarator.getVariables()) {
                    System.out.println("\t\t- " + var.getNameAsString() + " such as " + var.getType() + " type");
                    declaredVariables.add(var.getNameAsString());
                }
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
            System.out.println(ANSI_GREEN + "\tStatements:" + ANSI_RESET);
            for (Statement statement : statements) {
                System.out.println("\t\t- " + statement);
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
                System.out.println(ANSI_YELLOW + "\t\t-> Variable " + variable + " is declared but never used." + ANSI_RESET);
            }
        }
    }
}
