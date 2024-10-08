package org.example;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleASTExample {
    private static final String PATH = "src/main/java/org/example/sample/Hello.java";

    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));
        System.out.println(cu);

        System.out.println("=============================================================");

        cu.findAll(ClassOrInterfaceDeclaration.class).forEach(className -> {
            System.out.println("Class name: " + className.getName());

            className.findAll(MethodDeclaration.class).forEach(methodDeclaration -> {
                System.out.println("Method name: " + methodDeclaration.getName()
                        + " is a " + methodDeclaration.getType() + " method");
            });
        });
    }
}

