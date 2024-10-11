package org.example.tests_for_methods;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import spoon.JarLauncher;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JarAstSingleMethodTest {

    private static final String JAR_PATH = "src/test/resources/jarprj-1.0-SNAPSHOT.jar";
    private static JarLauncher launcher;
    private static CtClass<?> classFound;
    private static CtMethod<String> methodFound;

    @BeforeClass
    public static void setUp() {
        launcher = new JarLauncher(JAR_PATH);
        launcher.buildModel();

        CtModel model = launcher.getModel();
        List<CtClass<?>> classesFound = model.getElements(new TypeFilter<>(CtClass.class));

        for (CtClass<?> ctClass : classesFound) {
            if (ctClass.getSimpleName().equals("StringManipulator")) {
                classFound = ctClass;
                break;
            }
        }

        if (!classesFound.isEmpty()) {
            String methodName = "isEqual";
            CtTypeReference<String> stringType = launcher.getFactory().Type().stringType();
            CtTypeReference<Boolean> booleanType = launcher.getFactory().Type().BOOLEAN_PRIMITIVE;
            methodFound = classFound.getMethod(methodName, stringType, stringType, booleanType);
        }
    }

    @Test
    public void verifyMethodFoundBySignature() {
        String expectedMethodName = "isEqual";
        String expectedVisibility = "public";
        int expectedAmountOfParameters = 3;
        CtTypeReference<String> expectedStringType = launcher.getFactory().Type().stringType();
        CtTypeReference<Boolean> expectedBooleanType = launcher.getFactory().Type().BOOLEAN_PRIMITIVE;

        Assert.assertNotNull(methodFound);
        assertEquals(expectedMethodName, methodFound.getSimpleName());
        assertEquals(expectedVisibility, methodFound.getVisibility().toString());
        assertEquals(expectedAmountOfParameters, methodFound.getParameters().size());
        assertTrue(methodFound.getReferencedTypes().contains(expectedStringType));
        assertTrue(methodFound.getReferencedTypes().contains(expectedBooleanType));
    }

    @Test
    public void verifyMethodLines() {
        int expectedStartLine = 30;
        int expectedEndLine = 35;
        int expectedAmountOfLines = expectedEndLine - expectedStartLine;

        Assert.assertNotNull(methodFound);
        assertEquals(expectedStartLine, methodFound.getPosition().getLine());
        assertEquals(expectedEndLine, methodFound.getPosition().getEndLine());
        assertEquals(expectedAmountOfLines,
                methodFound.getPosition().getEndLine() - methodFound.getPosition().getLine());
    }

    @Test
    public void verifyMethodSource() {
        String expectedSourceFile = "StringManipulator.java";
        int expectedLine = 30;

        Assert.assertNotNull(methodFound);
        assertEquals(expectedSourceFile, methodFound.getPosition().getFile().getName());
        assertEquals(expectedLine, methodFound.getPosition().getLine());
    }

    @Test
    public void verifyMethodParameters() {
        int expectedAmountOfParameters = 3;
        String defaultParameterName = "isExtra";
        CtTypeReference<Boolean> expectedBooleanType = launcher.getFactory().Type().BOOLEAN_PRIMITIVE;

        Assert.assertNotNull(methodFound);
        assertEquals(expectedAmountOfParameters, methodFound.getParameters().size());
        for (CtParameter<?> parameter : methodFound.getParameters()) {
            if (parameter.getSimpleName().equals(defaultParameterName)) {
                assertEquals(expectedBooleanType, parameter.getType());
            }
        }
    }

    @Test
    public void verifyMethodBody() {
        int expectedAmountOfStatements = 2;
        String expectedStatementOne = "if (isExtra) {\n" +
                "    return false;\n" +
                "}";
        String expectedStatementTwo = "return input.equals(inputToCompare)";

        Assert.assertNotNull(methodFound);
        CtBlock<?> methodBody = methodFound.getBody();
        assertEquals(expectedAmountOfStatements, methodBody.getStatements().size());
        assertEquals(expectedStatementOne, methodBody.getStatement(0).toString());
        assertEquals(expectedStatementTwo, methodBody.getStatement(1).toString());
    }
}
