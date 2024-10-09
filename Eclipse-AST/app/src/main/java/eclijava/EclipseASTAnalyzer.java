package eclijava;
import org.eclipse.jdt.core.dom.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class EclipseASTAnalyzer {

    private CompilationUnit compilationUnit;

    public EclipseASTAnalyzer(Path filePath) throws IOException {
        String sourceCode = new String(Files.readAllBytes(filePath));
        ASTParser parser = ASTParser.newParser(AST.JLS_Latest);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);
        parser.setSource(sourceCode.toCharArray());
        this.compilationUnit = (CompilationUnit) parser.createAST(null);
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
}