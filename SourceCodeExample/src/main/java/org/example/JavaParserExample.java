package org.example;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import org.example.Analisis.ASTAnalysis;
import org.example.Analisis.ClassMethodAnalysis;
import org.example.Analisis.ContextAnalysis;
import org.example.Analisis.PrintASTinText;

import java.io.File;
import java.io.FileInputStream;

public class JavaParserExample {
    public static void main() {
        try {
            FileInputStream in = new FileInputStream(new File("src/main/java/org/example/TestJava.java"));
            JavaParser javaParser = new JavaParser();
            CompilationUnit cu = javaParser.parse(in).getResult().get();

            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("Analysis of AST");
            System.out.println("***********************************");
            System.out.println("***********************************");

            ContextAnalysis analisis = new ContextAnalysis();
            analisis.setAnalisis(new ASTAnalysis(cu,0));
            analisis.Execute();

            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("Analysis of methods and classes");
            System.out.println("***********************************");
            System.out.println("***********************************");
            analisis.setAnalisis(new ClassMethodAnalysis(cu));
            analisis.Execute();

            System.out.println("***********************************");
            System.out.println("***********************************");
            System.out.println("Printing AST into txt file");
            System.out.println("***********************************");
            System.out.println("***********************************");
            analisis.setAnalisis(new PrintASTinText(cu));
            analisis.Execute();

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

