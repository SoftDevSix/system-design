package org.example.tests_for_methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class AstSingleMethodTest {

    private static final String CLASS_PATH = "src/main/java/org/example/modules_to_analyze/StringManipulator.java";
    private static Launcher launcher;
    private static CtClass<?> classFound;
    private static CtMethod<Boolean> methodFound;

    @BeforeClass
    public static void setup() {
        launcher = new Launcher();
        launcher.addInputResource(CLASS_PATH);
        launcher.getEnvironment().setComplianceLevel(17);
        launcher.buildModel();

        CtModel model = launcher.getModel();
        List<CtClass<?>> classesFound = model.getElements(
                new TypeFilter<>(CtClass.class));

        if (!classesFound.isEmpty()) {
            classFound = classesFound.get(0);
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

        assertNotNull(methodFound);
        if (methodFound != null) {
            assertEquals(expectedMethodName, methodFound.getSimpleName());
            assertEquals(expectedVisibility, methodFound.getVisibility().toString());
            assertEquals(expectedAmountOfParameters, methodFound.getParameters().size());
            assertTrue(methodFound.getReferencedTypes().contains(expectedStringType));
            assertTrue(methodFound.getReferencedTypes().contains(expectedBooleanType));
        }
    }

    @Test
    public void verifyMethodLines() {
        int expectedStartLine = 28;
        int expectedEndLine = 34;
        int expectedAmountOfLines = expectedEndLine - expectedStartLine;

        assertNotNull(methodFound);
        if (methodFound != null) {
            assertEquals(expectedStartLine, methodFound.getPosition().getLine());
            assertEquals(expectedEndLine, methodFound.getPosition().getEndLine());
            assertEquals(expectedAmountOfLines,
                    methodFound.getPosition().getEndLine() - methodFound.getPosition().getLine());
        }
    }

    @Test
    public void verifyMethodSource() {
        String expectedSourceFile = "StringManipulator.java";
        int expectedLine = 28;

        assertNotNull(methodFound);
        if (methodFound != null) {
            assertEquals(expectedSourceFile, methodFound.getPosition().getFile().getName());
            assertEquals(expectedLine, methodFound.getPosition().getLine());
        }
    }

    @Test
    public void verifyMethodParameters() {
        int expectedAmountOfParameters = 3;
        String defaultParameterName = "isExtra";
        CtTypeReference<Boolean> expectedBooleanType = launcher.getFactory().Type().BOOLEAN_PRIMITIVE;

        assertNotNull(methodFound);
        if (methodFound != null) {
            assertEquals(expectedAmountOfParameters, methodFound.getParameters().size());
            for (CtParameter<?> parameter : methodFound.getParameters()) {
                if (parameter.getSimpleName().equals(defaultParameterName)) {
                    assertEquals(expectedBooleanType, parameter.getType());
                }
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

        assertNotNull(methodFound);
        if (methodFound != null) {
            CtBlock<?> methodBody = methodFound.getBody();
            assertEquals(expectedAmountOfStatements, methodBody.getStatements().size());
            assertEquals(expectedStatementOne, methodBody.getStatement(0).toString());
            assertEquals(expectedStatementTwo, methodBody.getStatement(1).toString());
        }
    }

}
