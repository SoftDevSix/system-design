package org.example;

import org.benf.cfr.reader.Main;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DecompileAndGenerateAST {

    public static void main(String[] args) {
        String jarPath = "src/main/resources/TestSonarJava-1.0-SNAPSHOT.jar";
        String outputDir = "src/main/resources/decompiled";
        decompileJar(jarPath, outputDir);
        generateASTFromSource(outputDir);
    }

    private static void decompileJar(String jarPath, String outputDir) {

        File outputDirectory = new File(outputDir);
        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }


        String[] cfrArgs = {jarPath, "--outputdir", outputDir};
        Main.main(cfrArgs);
    }

    private static void generateASTFromSource(String sourceDir) {

        Launcher spoonLauncher = new Launcher();
        spoonLauncher.addInputResource(sourceDir);


        spoonLauncher.buildModel();
        CtModel model = spoonLauncher.getModel();


        try (FileWriter writer = new FileWriter("src/main/resources/ASTOutput.txt")) {
            for (CtType<?> type : model.getAllTypes()) {
                writer.write("Type: " + type.getSimpleName() + "\n");
                writer.write("Modifiers: " + type.getModifiers() + "\n");
                writer.write("Methods:\n");
                for (CtMethod<?> method : type.getMethods()) {
                    writer.write("  - Method: " + method.getSimpleName() + "\n");
                    writer.write("    Return Type: " + method.getType().getSimpleName() + "\n");
                    writer.write("    Modifiers: " + method.getModifiers() + "\n");
                }
                writer.write("Fields:\n");
                for (CtField<?> field : type.getFields()) {
                    writer.write("  - Field: " + field.getSimpleName() + "\n");
                    writer.write("    Type: " + field.getType().getSimpleName() + "\n");
                    writer.write("    Modifiers: " + field.getModifiers() + "\n");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
