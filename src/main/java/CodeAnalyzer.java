import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.ArrayList;
import java.util.List;

public class CodeAnalyzer {
    private static class MethodVisitor extends SimpleJavaBaseVisitor<Void> {
        private List<String> issues = new ArrayList<>();
        private String currentMethod = "";
        private java.util.Map<String, Integer> ifCountMap = new java.util.HashMap<>();

        @Override
        public Void visitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx) {
            currentMethod = ctx.IDENTIFIER().getText();

            if (ctx.parameterList() != null) {
                int paramCount = ctx.parameterList().parameter().size();
                if (paramCount > 3) {
                    issues.add(String.format(
                            "Método '%s' tiene demasiados parámetros: %d",
                            currentMethod, paramCount
                    ));
                }
            }

            int lines = ctx.stop.getLine() - ctx.start.getLine() + 1;
            if (lines > 10) {
                issues.add(String.format(
                        "Método '%s' es demasiado largo: %d líneas",
                        currentMethod, lines
                ));
            }

            return super.visitMethodDeclaration(ctx);
        }

        @Override
        public Void visitIfStatement(SimpleJavaParser.IfStatementContext ctx) {
            countIfStatements();
            return super.visitIfStatement(ctx);
        }

        private void countIfStatements() {
            if (!ifCountMap.containsKey(currentMethod)) {
                ifCountMap.put(currentMethod, 1);
            } else {
                int count = ifCountMap.get(currentMethod) + 1;
                ifCountMap.put(currentMethod, count);

                if (count > 2) {
                    issues.add(String.format(
                            "Método '%s' tiene demasiados IFs: %d",
                            currentMethod, count
                    ));
                }
            }
        }

        public List<String> getIssues() {
            return issues;
        }
    }

    public static void main(String[] args) {
        String testCode =
                "class Test {\n" +
                        "    public void complexMethod(int a, int b, int c, int d) {\n" +
                        "        if (a > 0) {\n" +
                        "            System.out.println(\"a\");\n" +
                        "        }\n" +
                        "        if (b > 0) {\n" +
                        "            System.out.println(\"b\");\n" +
                        "        }\n" +
                        "        if (c > 0) {\n" +
                        "            System.out.println(\"c\");\n" +
                        "        }\n" +
                        "        if (c > 0) {\n" +
                        "            System.out.println(\"c\");\n" +
                        "        }\n" +
                        "    }\n" +
                        "}\n";

        analyzeCode(testCode);
    }

    public static void analyzeCode(String sourceCode) {
        CharStream input = CharStreams.fromString(sourceCode);
        SimpleJavaLexer lexer = new SimpleJavaLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);

        ParseTree tree = parser.compilationUnit();

        MethodVisitor visitor = new MethodVisitor();
        visitor.visit(tree);

        List<String> issues = visitor.getIssues();
        if (issues.isEmpty()) {
            System.out.println("No se encontraron problemas en el código.");
        } else {
            System.out.println("Problemas encontrados:");
            for (String issue : issues) {
                System.out.println("- " + issue);
            }
        }
    }
}