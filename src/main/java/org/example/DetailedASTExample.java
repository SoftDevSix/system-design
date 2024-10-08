package org.example;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DetailedASTExample {
    private static final String PATH = "src/main/java/org/example/sample/Hello.java";

    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));

        cu.findAll(ClassOrInterfaceDeclaration.class).forEach(classFounded -> {
            System.out.println("Class name: " + classFounded.getName());
            System.out.println("=======================================================");

            classFounded.findAll(MethodDeclaration.class).forEach(methodDeclaration -> {
                System.out.println("Method: " + methodDeclaration.getName() + " is a " + methodDeclaration.getType() + " method");

                for (Parameter parameter : methodDeclaration.getParameters()) {
                    System.out.println("Parameter: " + parameter.getNameAsString() + " as type " + parameter.getType());
                }

                methodDeclaration.findAll(VariableDeclarationExpr.class).forEach(variableDeclarator -> {
                    System.out.println("Variable: " + variableDeclarator.getVariables() + " as type " + variableDeclarator.getElementType());
                });

                methodDeclaration.getBody().ifPresent(body -> {
                    for (Statement statement : body.getStatements()) {
                        System.out.println("Sentences: " + statement);
                    }
                });

                System.out.println("=======================================================");
            });
        });
    }
}
