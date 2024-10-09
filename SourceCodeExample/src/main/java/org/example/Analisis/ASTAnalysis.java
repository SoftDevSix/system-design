package org.example.Analisis;

import com.github.javaparser.ast.Node;

public class ASTAnalysis implements Analysis {
    private Node node;
    private int level;

    public ASTAnalysis(Node node, int level) {
        this.level = level;
        this.node = node;
    }

    @Override
    public void AnalysisReport() {
        printAST(node,level);
    }

    private static void printAST(Node node, int level){
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
        }

        System.out.println(node.getClass().getSimpleName() + " : " + node);
        for (Node child : node.getChildNodes()){
            printAST(child, 0);
        }
    }
}
