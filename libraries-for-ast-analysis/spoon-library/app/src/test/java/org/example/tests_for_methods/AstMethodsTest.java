package org.example.tests_for_methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.TypeFilter;

public class AstMethodsTest {

    private static final String CLASS_PATH = "src/main/java/org/example/modules_to_analyze/StringManipulator.java";
    private static Launcher launcher;
    private static CtClass<?> classFound;

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
        }
    }

    @Test
    public void verifyAmountOfClassMethods() {
        int expectedAmountOfMethods = 6;

        assertNotNull(classFound);
        if (classFound != null) {
            assertEquals(expectedAmountOfMethods, classFound.getMethods().size());
        }
    }
}
