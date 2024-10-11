package org.example.tests_for_methods;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import spoon.JarLauncher;
import spoon.decompiler.ProcyonDecompiler;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class JarAstSingleMethodWithSpecificDecompilerTest {

    private static final String JAR_PATH = "src/test/resources/jarprj-1.0-SNAPSHOT.jar";
    private static CtClass<?> classFound;
    private static CtMethod<String> methodFound;

    @BeforeClass
    public static void setUp() {
        JarLauncher launcher = new JarLauncher(
                JAR_PATH,
                null,
                null,
                new ProcyonDecompiler()
        );
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
    public void verifyMethodLines() {
        int expectedStartLine = 28;
        int expectedEndLine = 30;
        int expectedAmountOfLines = expectedEndLine - expectedStartLine;

        Assert.assertNotNull(methodFound);
        assertEquals(expectedStartLine, methodFound.getPosition().getLine());
        assertEquals(expectedEndLine, methodFound.getPosition().getEndLine());
        assertEquals(expectedAmountOfLines,
                methodFound.getPosition().getEndLine() - methodFound.getPosition().getLine());
    }

    @Test
    public void verifyMethodBody() {
        int expectedAmountOfStatements = 1;
        String expectedStatement = "return (!isExtra) && input.equals(inputToCompare)";

        Assert.assertNotNull(methodFound);
        CtBlock<?> methodBody = methodFound.getBody();
        assertEquals(expectedAmountOfStatements, methodBody.getStatements().size());
        assertEquals(expectedStatement, methodBody.getStatement(0).toString());
    }
}
