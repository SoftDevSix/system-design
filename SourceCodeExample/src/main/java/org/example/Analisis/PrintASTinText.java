package org.example.Analisis;

import com.github.javaparser.ast.Node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrintASTinText implements Analysis{

    Node node;
    public PrintASTinText(Node node){
        this.node = node;
    }

    public void saveASTToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writeASTToFile(writer, node, 0);
            System.out.println("Análisis del AST guardado en: " + filename);
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private static void writeASTToFile(BufferedWriter writer, Node node, int level) throws IOException {
        for (int i = 0; i < level; i++) {
            writer.write(" ");
        }

        writer.write(node.getClass().getSimpleName() + " : " + node + "\n");
        for (Node child : node.getChildNodes()) {
            writeASTToFile(writer, child, level + 1);
        }
    }

    @Override
    public void AnalysisReport() {
        saveASTToFile("PrintASTAsText");
    }
}
