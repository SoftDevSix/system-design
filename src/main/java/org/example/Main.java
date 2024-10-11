package org.example;


public class Main {
    public static void main(String[] args) {
        String jarFilePath = "src/main/resources/TestSonarJava-1.0-SNAPSHOT.jar";
        String outputPath = "analysis.txt";
        BytecodeAnalysis.analyze(jarFilePath, outputPath);

        String outputDir = "src/main/resources/decompiled";
        DecompileAndGenerateAST ast = new DecompileAndGenerateAST();
        ast.decompileJar(jarFilePath, outputDir);
        ast.generateASTFromSource(outputDir);
    }
}
