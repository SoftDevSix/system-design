// Generated from JavaFunction.g4 by ANTLR 4.7.2

    package com.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaFunctionParser}.
 */
public interface JavaFunctionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JavaFunctionParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JavaFunctionParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(JavaFunctionParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(JavaFunctionParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(JavaFunctionParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(JavaFunctionParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(JavaFunctionParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(JavaFunctionParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaFunctionParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaFunctionParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(JavaFunctionParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(JavaFunctionParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JavaFunctionParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JavaFunctionParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaFunctionParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaFunctionParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JavaFunctionParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JavaFunctionParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JavaFunctionParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JavaFunctionParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(JavaFunctionParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(JavaFunctionParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(JavaFunctionParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(JavaFunctionParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(JavaFunctionParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(JavaFunctionParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(JavaFunctionParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(JavaFunctionParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(JavaFunctionParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(JavaFunctionParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(JavaFunctionParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(JavaFunctionParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaFunctionParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaFunctionParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(JavaFunctionParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(JavaFunctionParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(JavaFunctionParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(JavaFunctionParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JavaFunctionParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JavaFunctionParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavaFunctionParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavaFunctionParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JavaFunctionParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JavaFunctionParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JavaFunctionParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JavaFunctionParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(JavaFunctionParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(JavaFunctionParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(JavaFunctionParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(JavaFunctionParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCompactConstructorDeclaration(JavaFunctionParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCompactConstructorDeclaration(JavaFunctionParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaFunctionParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaFunctionParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(JavaFunctionParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(JavaFunctionParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(JavaFunctionParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(JavaFunctionParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(JavaFunctionParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(JavaFunctionParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(JavaFunctionParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(JavaFunctionParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(JavaFunctionParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(JavaFunctionParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(JavaFunctionParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(JavaFunctionParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(JavaFunctionParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(JavaFunctionParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceCommonBodyDeclaration(JavaFunctionParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceCommonBodyDeclaration(JavaFunctionParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaFunctionParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaFunctionParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaFunctionParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaFunctionParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JavaFunctionParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JavaFunctionParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JavaFunctionParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JavaFunctionParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JavaFunctionParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JavaFunctionParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(JavaFunctionParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(JavaFunctionParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(JavaFunctionParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(JavaFunctionParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JavaFunctionParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JavaFunctionParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JavaFunctionParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JavaFunctionParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(JavaFunctionParser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(JavaFunctionParser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JavaFunctionParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JavaFunctionParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaFunctionParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaFunctionParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JavaFunctionParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JavaFunctionParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIList(JavaFunctionParser.LambdaLVTIListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIList(JavaFunctionParser.LambdaLVTIListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void enterLambdaLVTIParameter(JavaFunctionParser.LambdaLVTIParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 */
	void exitLambdaLVTIParameter(JavaFunctionParser.LambdaLVTIParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JavaFunctionParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JavaFunctionParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JavaFunctionParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JavaFunctionParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavaFunctionParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavaFunctionParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JavaFunctionParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JavaFunctionParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterAltAnnotationQualifiedName(JavaFunctionParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitAltAnnotationQualifiedName(JavaFunctionParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(JavaFunctionParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(JavaFunctionParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(JavaFunctionParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(JavaFunctionParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(JavaFunctionParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(JavaFunctionParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(JavaFunctionParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(JavaFunctionParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(JavaFunctionParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(JavaFunctionParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(JavaFunctionParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(JavaFunctionParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(JavaFunctionParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(JavaFunctionParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(JavaFunctionParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(JavaFunctionParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(JavaFunctionParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(JavaFunctionParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(JavaFunctionParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(JavaFunctionParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(JavaFunctionParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(JavaFunctionParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(JavaFunctionParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(JavaFunctionParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(JavaFunctionParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(JavaFunctionParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterModuleDeclaration(JavaFunctionParser.ModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitModuleDeclaration(JavaFunctionParser.ModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(JavaFunctionParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(JavaFunctionParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void enterModuleDirective(JavaFunctionParser.ModuleDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#moduleDirective}.
	 * @param ctx the parse tree
	 */
	void exitModuleDirective(JavaFunctionParser.ModuleDirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void enterRequiresModifier(JavaFunctionParser.RequiresModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#requiresModifier}.
	 * @param ctx the parse tree
	 */
	void exitRequiresModifier(JavaFunctionParser.RequiresModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRecordDeclaration(JavaFunctionParser.RecordDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#recordDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRecordDeclaration(JavaFunctionParser.RecordDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void enterRecordHeader(JavaFunctionParser.RecordHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#recordHeader}.
	 * @param ctx the parse tree
	 */
	void exitRecordHeader(JavaFunctionParser.RecordHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponentList(JavaFunctionParser.RecordComponentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#recordComponentList}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponentList(JavaFunctionParser.RecordComponentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void enterRecordComponent(JavaFunctionParser.RecordComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#recordComponent}.
	 * @param ctx the parse tree
	 */
	void exitRecordComponent(JavaFunctionParser.RecordComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void enterRecordBody(JavaFunctionParser.RecordBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#recordBody}.
	 * @param ctx the parse tree
	 */
	void exitRecordBody(JavaFunctionParser.RecordBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaFunctionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaFunctionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JavaFunctionParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JavaFunctionParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JavaFunctionParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JavaFunctionParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(JavaFunctionParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(JavaFunctionParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(JavaFunctionParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(JavaFunctionParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(JavaFunctionParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(JavaFunctionParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaFunctionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaFunctionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(JavaFunctionParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(JavaFunctionParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(JavaFunctionParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(JavaFunctionParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(JavaFunctionParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(JavaFunctionParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(JavaFunctionParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(JavaFunctionParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(JavaFunctionParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(JavaFunctionParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(JavaFunctionParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(JavaFunctionParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JavaFunctionParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JavaFunctionParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JavaFunctionParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JavaFunctionParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JavaFunctionParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JavaFunctionParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JavaFunctionParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JavaFunctionParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JavaFunctionParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JavaFunctionParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JavaFunctionParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JavaFunctionParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JavaFunctionParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JavaFunctionParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JavaFunctionParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JavaFunctionParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaFunctionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaFunctionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(JavaFunctionParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(JavaFunctionParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(JavaFunctionParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(JavaFunctionParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(JavaFunctionParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(JavaFunctionParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(JavaFunctionParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(JavaFunctionParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JavaFunctionParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JavaFunctionParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(JavaFunctionParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(JavaFunctionParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabeledRule(JavaFunctionParser.SwitchLabeledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabeledRule(JavaFunctionParser.SwitchLabeledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGuardedPattern(JavaFunctionParser.GuardedPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#guardedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGuardedPattern(JavaFunctionParser.GuardedPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void enterSwitchRuleOutcome(JavaFunctionParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 */
	void exitSwitchRuleOutcome(JavaFunctionParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(JavaFunctionParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(JavaFunctionParser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(JavaFunctionParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(JavaFunctionParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(JavaFunctionParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(JavaFunctionParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(JavaFunctionParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(JavaFunctionParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(JavaFunctionParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(JavaFunctionParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(JavaFunctionParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(JavaFunctionParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(JavaFunctionParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(JavaFunctionParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(JavaFunctionParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(JavaFunctionParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(JavaFunctionParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(JavaFunctionParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(JavaFunctionParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(JavaFunctionParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(JavaFunctionParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(JavaFunctionParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JavaFunctionParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JavaFunctionParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JavaFunctionParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JavaFunctionParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(JavaFunctionParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(JavaFunctionParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(JavaFunctionParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(JavaFunctionParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(JavaFunctionParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(JavaFunctionParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaFunctionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(JavaFunctionParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaFunctionParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(JavaFunctionParser.ArgumentsContext ctx);
}