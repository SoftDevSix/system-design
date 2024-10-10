package org.example.sample;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.Parameter;
import com.github.javaparser.ast.body.VariableDeclarator;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.Statement;
import java.util.List;

public class Hello {
    private static void sayHiToMaxVerstappen() {
        System.out.println("Hello, Max Verstappen!!");
    }

    private static String checoPerez() {
        return "Checho Perez just takes the victory";
    }

    public static void main(String[] args) {
        System.out.println("GREETINGS");
        sayHiToMaxVerstappen();

        String perez = checoPerez();
        System.out.println(perez);

        String redBull = "FROM RED BULL RACING";
        longParameters(1,"no", 2.2, true, "yes");
    }

    private static void longParameters(int num1, String par2, Double num2, boolean yes, String drink) {
        String redBull = "FROM RED BULL RACING";
    }
}
