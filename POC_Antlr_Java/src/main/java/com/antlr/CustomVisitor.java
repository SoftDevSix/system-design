package com.antlr;

public class CustomVisitor extends JavaFunctionBaseVisitor<Void> {

    @Override
    public Void visitClassDeclaration(JavaFunctionParser.ClassDeclarationContext ctx) {
        System.out.println("Visited class: " + ctx.getText());

        return visitChildren(ctx);
    }

    @Override
    public Void visitClassOrInterfaceModifier(JavaFunctionParser.ClassOrInterfaceModifierContext ctx) {
        System.out.println("Visited modifier: " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Void visitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx) {
        System.out.println("Visited function declaration: " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Void visitFormalParameters(JavaFunctionParser.FormalParametersContext ctx) {
        System.out.println("Visited parameter: " + ctx.getText());
        return visitChildren(ctx);
    }

    @Override
    public Void visitTypeParameters(JavaFunctionParser.TypeParametersContext ctx) {
        System.out.println("Visited parameter type: " + ctx.getText());

        return visitChildren(ctx);
    }

}
