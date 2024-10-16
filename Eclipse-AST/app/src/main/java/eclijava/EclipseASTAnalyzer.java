package eclijava;
import org.eclipse.jdt.core.dom.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EclipseASTAnalyzer {

    private CompilationUnit compilationUnit;
    private String sourceCode;

    
    public EclipseASTAnalyzer(Path filePath) throws IOException {
        this.sourceCode = new String(Files.readAllBytes(filePath));
        ASTParser parser = ASTParser.newParser(AST.JLS_Latest);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setSource(sourceCode.toCharArray());
        parser.setBindingsRecovery(true);
        parser.setResolveBindings(true);

        this.compilationUnit = (CompilationUnit) parser.createAST(null);
        System.out.println(this.compilationUnit);
    }
    
    public MethodDeclaration getMethodDeclaration(String methodName) {
        TypeDeclaration typeDecl = (TypeDeclaration) compilationUnit.types().get(0);
        for (MethodDeclaration method : typeDecl.getMethods()) {
            if (method.getName().getIdentifier().equals(methodName)) {
                return method;
            }
        }
        return null;
    }
    
    public String getClassName() {
        TypeDeclaration typeDeclaration = (TypeDeclaration) compilationUnit.types().get(0);
        return typeDeclaration.getName().getIdentifier();
    }

    public int getMethodCount() {
        TypeDeclaration typeDeclaration = (TypeDeclaration) compilationUnit.types().get(0);
        return typeDeclaration.getMethods().length;
    }

    public List<String> getMethodNames() {
        TypeDeclaration typeDeclaration = (TypeDeclaration) compilationUnit.types().get(0);
        List<String> methodNames = new ArrayList<>();
        for (MethodDeclaration method : typeDeclaration.getMethods()) {
            methodNames.add(method.getName().getIdentifier());
        }
        return methodNames;
    }

    public List<String> getMethodParameters(String methodName) {
        TypeDeclaration typeDeclaration = (TypeDeclaration) compilationUnit.types().get(0);
        List<String> parameterTypes = new ArrayList<>();
        for (MethodDeclaration method : typeDeclaration.getMethods()) {
            if (method.getName().getIdentifier().equals(methodName)) {
                for (Object parameter : method.parameters()) {
                    SingleVariableDeclaration parameterIndex = (SingleVariableDeclaration) parameter;
                    parameterTypes.add(parameterIndex.getType().toString()); 
                }
            }
        }
        return parameterTypes;
    }

    public int getMethodParameterCount(String methodName) {
        TypeDeclaration typeDecl = (TypeDeclaration) compilationUnit.types().get(0);
        for (MethodDeclaration method : typeDecl.getMethods()) {
            if (method.getName().getIdentifier().equals(methodName)) {
                return method.parameters().size(); 
            }
        }
        return 0;
    }

    public int getMethodLineCount(String methodName) {
        TypeDeclaration typeDecl = (TypeDeclaration) compilationUnit.types().get(0);
        for (MethodDeclaration method : typeDecl.getMethods()) {
            if (method.getName().getIdentifier().equals(methodName)) {
                int startLine = compilationUnit.getLineNumber(method.getStartPosition());
                int endLine = compilationUnit.getLineNumber(method.getStartPosition() + method.getLength());
                return endLine - startLine; 
            }
        }
        return 0;
    }

    public void printMethodCodeLines() {
        TypeDeclaration typeDecl = (TypeDeclaration) compilationUnit.types().get(0);
        for (MethodDeclaration method : typeDecl.getMethods()) {
            System.out.println("Method: " + method.getName().getIdentifier());
            int startLine = compilationUnit.getLineNumber(method.getStartPosition());
            int endLine = compilationUnit.getLineNumber(method.getStartPosition() + method.getLength());

            String[] lines = sourceCode.split("\n");
            for (int i = startLine - 1; i < endLine; i++) {
                System.out.println("Line " + (i + 1) + ": " + lines[i].trim());
            }

            printMethodVariables(method);
            printMethodStatements(method);
        }
    }

     public void printMethodVariables(MethodDeclaration method) {
        System.out.println("Variables used in method: " + method.getName().getIdentifier());
        
        method.accept(new ASTVisitor() {
            @Override
            public boolean visit(VariableDeclarationFragment node) {
                IVariableBinding binding = node.resolveBinding();
                if (binding != null) {
                    System.out.println("Variable: " + node.getName().getIdentifier() + " of type " + binding.getType().getName());
                } else {
                    System.out.println("Variable: " + node.getName().getIdentifier() + " (unable to resolve type)");
                }
                return super.visit(node);
            }
        });
    }

    public void printMethodStatements(MethodDeclaration method) {
        System.out.println("Statements in method: " + method.getName().getIdentifier());

        method.accept(new ASTVisitor() {
            @Override
            public boolean visit(ExpressionStatement node) {
                System.out.println("Expression Statement: " + node.toString().trim());
                return super.visit(node);
            }

            @Override
            public boolean visit(ReturnStatement node) {
                System.out.println("Return Statement: " + node.toString().trim());
                return super.visit(node);
            }

            @Override
            public boolean visit(IfStatement node) {
                System.out.println("If Statement: " + node.getExpression().toString().trim());
                return super.visit(node);
            }

            @Override
            public boolean visit(ForStatement node) {
                System.out.println("For Statement: " + node.toString().trim());
                return super.visit(node);
            }

            @Override
            public boolean visit(WhileStatement node) {
                System.out.println("While Statement: " + node.toString().trim());
                return super.visit(node);
            }
        });
    }
}