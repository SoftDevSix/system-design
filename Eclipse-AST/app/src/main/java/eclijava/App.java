package eclijava;
import java.nio.file.Path;
import java.nio.file.Paths;


public class App {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("src/main/java/eclijava/TestClass.java");
            EclipseASTAnalyzer analyzer = new EclipseASTAnalyzer(filePath);
            analyzer.getClassName();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}