/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package eclijava;

import org.junit.Test;
import static org.junit.Assert.*;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.junit.Before;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ASTAnalyzerTest {

    private EclipseASTAnalyzer analyzer;

    @Before
    public void setUp() throws Exception {
        Path filePath = Paths.get("src/main/java/eclijava/TestClass.java");
        analyzer = new EclipseASTAnalyzer(filePath);
    }

    @Test
    public void testClassName() {
        String actualClassName = analyzer.getClassName();

        assertEquals("TestClass", actualClassName);
    }

    @Test
    public void testMethodCount() {
        int actualMethodCount = analyzer.getMethodCount();
        assertEquals(4, actualMethodCount);
    }

    @Test
    public void testMethodNames() {
        List<String> expectedMethodNames = List.of("main", "sum", "product", "divide");
        List<String> actualMethodNames = analyzer.getMethodNames();
        assertEquals(expectedMethodNames.size(), actualMethodNames.size());
        assertTrue(actualMethodNames.containsAll(expectedMethodNames));
    }

    @Test
    public void testMethodParameters() {
        List<String> expectedParameters = List.of("String[]");
        List<String> actualParameters = analyzer.getMethodParameters("main");

        assertEquals(expectedParameters.size(), actualParameters.size());
        assertEquals(expectedParameters, actualParameters);
    }

    @Test
    public void testGetMethodParameterCount() {
        int paramCount = analyzer.getMethodParameterCount("divide");
        assertEquals(3, paramCount);
    }

    @Test
    public void testGetMethodLineCount() {
        int lineCount = analyzer.getMethodLineCount("divide");
        assertEquals(9, lineCount);
    }
    
    @Test
    public void testPrintMethodVariables() {
        MethodDeclaration method = analyzer.getMethodDeclaration("divide");
        assertNotNull(method);
        analyzer.printMethodVariables(method);
    }

    @Test
    public void testPrintMethodStatements() {
        MethodDeclaration method = analyzer.getMethodDeclaration("divide");
        assertNotNull(method);
        analyzer.printMethodStatements(method);
    }
}