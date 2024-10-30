package com.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws Exception {
        String filePath = "src/main/java/com/antlr/ExampleFile.java";

        try {
            String functionCode = new String(Files.readAllBytes(Paths.get(filePath)));
            CharStream input = CharStreams.fromString(functionCode);

            JavaFunctionLexer lexer = new JavaFunctionLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            JavaFunctionParser parser = new JavaFunctionParser(tokens);

            ParseTree tree = parser.compilationUnit();

            CustomVisitor visitor = new CustomVisitor();
            visitor.visit(tree);
            NamingConventionVisitor visitor1 = new NamingConventionVisitor();
            visitor1.visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
