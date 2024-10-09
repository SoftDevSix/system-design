package org.example;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SimpleASTExample {
    private static final String PATH = "src/main/java/org/example/sample/Hello.java";

    public static void main(String[] args) throws IOException {
        CompilationUnit cu = StaticJavaParser.parse(Files.newInputStream(Paths.get(PATH)));
        System.out.println(cu);

        System.out.println("=============================================================");

        List<ClassOrInterfaceDeclaration> classes = cu.findAll(ClassOrInterfaceDeclaration.class);

        for (ClassOrInterfaceDeclaration classDeclaration : classes) {
            System.out.println("Class name: " + classDeclaration.getName());
            List<MethodDeclaration> methods = classDeclaration.findAll(MethodDeclaration.class);

            for (MethodDeclaration methodDeclaration : methods) {
                System.out.println("Method name: " + methodDeclaration.getName()
                        + " is a " + methodDeclaration.getType() + " method");
            }
        }
    }
}

