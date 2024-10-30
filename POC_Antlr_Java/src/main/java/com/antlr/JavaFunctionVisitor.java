// Generated from JavaFunction.g4 by ANTLR 4.7.2

    package com.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaFunctionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaFunctionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JavaFunctionParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(JavaFunctionParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(JavaFunctionParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(JavaFunctionParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaFunctionParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(JavaFunctionParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JavaFunctionParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaFunctionParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JavaFunctionParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JavaFunctionParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(JavaFunctionParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(JavaFunctionParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(JavaFunctionParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(JavaFunctionParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(JavaFunctionParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(JavaFunctionParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaFunctionParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(JavaFunctionParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(JavaFunctionParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JavaFunctionParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaFunctionParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JavaFunctionParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JavaFunctionParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JavaFunctionParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(JavaFunctionParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(JavaFunctionParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#compactConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompactConstructorDeclaration(JavaFunctionParser.CompactConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaFunctionParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(JavaFunctionParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(JavaFunctionParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(JavaFunctionParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(JavaFunctionParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(JavaFunctionParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(JavaFunctionParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(JavaFunctionParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#interfaceCommonBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceCommonBodyDeclaration(JavaFunctionParser.InterfaceCommonBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaFunctionParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaFunctionParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JavaFunctionParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JavaFunctionParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JavaFunctionParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(JavaFunctionParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(JavaFunctionParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JavaFunctionParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JavaFunctionParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#receiverParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiverParameter(JavaFunctionParser.ReceiverParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JavaFunctionParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaFunctionParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JavaFunctionParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lambdaLVTIList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIList(JavaFunctionParser.LambdaLVTIListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lambdaLVTIParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLVTIParameter(JavaFunctionParser.LambdaLVTIParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JavaFunctionParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JavaFunctionParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JavaFunctionParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JavaFunctionParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#altAnnotationQualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltAnnotationQualifiedName(JavaFunctionParser.AltAnnotationQualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(JavaFunctionParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(JavaFunctionParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(JavaFunctionParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(JavaFunctionParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(JavaFunctionParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(JavaFunctionParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(JavaFunctionParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(JavaFunctionParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(JavaFunctionParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(JavaFunctionParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(JavaFunctionParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(JavaFunctionParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(JavaFunctionParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#moduleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDeclaration(JavaFunctionParser.ModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#moduleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleBody(JavaFunctionParser.ModuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#moduleDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleDirective(JavaFunctionParser.ModuleDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#requiresModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequiresModifier(JavaFunctionParser.RequiresModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#recordDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordDeclaration(JavaFunctionParser.RecordDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#recordHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordHeader(JavaFunctionParser.RecordHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#recordComponentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponentList(JavaFunctionParser.RecordComponentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#recordComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordComponent(JavaFunctionParser.RecordComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#recordBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordBody(JavaFunctionParser.RecordBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaFunctionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JavaFunctionParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JavaFunctionParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JavaFunctionParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdentifier(JavaFunctionParser.TypeIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(JavaFunctionParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaFunctionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(JavaFunctionParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(JavaFunctionParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(JavaFunctionParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(JavaFunctionParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(JavaFunctionParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JavaFunctionParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JavaFunctionParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JavaFunctionParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JavaFunctionParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JavaFunctionParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JavaFunctionParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JavaFunctionParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JavaFunctionParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JavaFunctionParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaFunctionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(JavaFunctionParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(JavaFunctionParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(JavaFunctionParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(JavaFunctionParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JavaFunctionParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(JavaFunctionParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#switchLabeledRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabeledRule(JavaFunctionParser.SwitchLabeledRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#guardedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardedPattern(JavaFunctionParser.GuardedPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#switchRuleOutcome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchRuleOutcome(JavaFunctionParser.SwitchRuleOutcomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(JavaFunctionParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(JavaFunctionParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(JavaFunctionParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(JavaFunctionParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(JavaFunctionParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(JavaFunctionParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(JavaFunctionParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(JavaFunctionParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(JavaFunctionParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(JavaFunctionParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(JavaFunctionParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JavaFunctionParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JavaFunctionParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(JavaFunctionParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(JavaFunctionParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(JavaFunctionParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaFunctionParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(JavaFunctionParser.ArgumentsContext ctx);
}