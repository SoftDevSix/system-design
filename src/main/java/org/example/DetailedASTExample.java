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

    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));

        List<ClassOrInterfaceDeclaration> classes = cu.findAll(ClassOrInterfaceDeclaration.class);
        for (ClassOrInterfaceDeclaration classDeclaration : classes) {
            processClass(classDeclaration);
        }
    }

    private static void processClass(ClassOrInterfaceDeclaration classDeclaration) {
        System.out.println("Class name: " + classDeclaration.getName());
        System.out.println("=======================================================");

        List<MethodDeclaration> methods = classDeclaration.findAll(MethodDeclaration.class);
        for (MethodDeclaration methodDeclaration : methods) {
            processMethod(methodDeclaration, 6);
        }
    }

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

    private static void checkMethodLineCount(MethodDeclaration method, int maxLines) {
        int startLine = method.getBegin().get().line + 1;
        int endLine = method.getEnd().get().line;
        int lineCount = endLine - startLine;

        if (lineCount > maxLines) {
            System.out.println("Method " + method.getName() + " has " + lineCount + " lines code and limit is: " + maxLines);
        }
    }

    private static void processParameters(MethodDeclaration methodDeclaration) {
        for (Parameter parameter : methodDeclaration.getParameters()) {
            System.out.println("Parameter: " + parameter.getNameAsString() + " as type " + parameter.getType());
        }
    }

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

    private static Set<String> processUsedVariables(MethodDeclaration methodDeclaration) {
        Set<String> usedVariables = new HashSet<>();
        List<NameExpr> expressions = methodDeclaration.findAll(NameExpr.class);
        for (NameExpr expr : expressions) {
            String variableName = expr.getNameAsString();
            usedVariables.add(variableName);
        }
        return usedVariables;
    }

    private static void processStatements(MethodDeclaration methodDeclaration) {
        if (methodDeclaration.getBody().isPresent()) {
            List<Statement> statements = methodDeclaration.getBody().get().getStatements();
            for (Statement statement : statements) {
                System.out.println("Sentences: " + statement);
            }
        }
    }

    private static void detectUnusedVariables(Set<String> declaredVariables, Set<String> usedVariables) {
        for (String variable : declaredVariables) {
            if (!usedVariables.contains(variable)) {
                System.out.println("Warning: Variable '" + variable + "' is declared but never used.");
            }
        }
    }
}
