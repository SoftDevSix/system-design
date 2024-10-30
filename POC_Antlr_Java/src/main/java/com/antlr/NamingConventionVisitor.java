package com.antlr;
import java.util.regex.Pattern;

public class NamingConventionVisitor extends JavaFunctionBaseVisitor<Void> {

    private static final Pattern CAMEL_CASE = Pattern.compile("^[a-z][a-zA-Z0-9]*$");

    @Override
    public Void visitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx) {
        String functionName = ctx.identifier().getText();

        if (!CAMEL_CASE.matcher(functionName).matches()) {
            System.out.println("Error: The function name '" + functionName + "' does not follow camel case.");
        } else {
            System.out.println("GOOD");
        }

        return visitChildren(ctx);
    }
}
