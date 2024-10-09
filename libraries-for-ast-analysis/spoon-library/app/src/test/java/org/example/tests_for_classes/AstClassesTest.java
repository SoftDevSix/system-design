package org.example.tests_for_classes;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.TypeFilter;

public class AstClassesTest {

    private static final String CLASS_PATH = "src/main/java/org/example/modules_to_analyze";
    private static List<CtClass<?>> classesFound;

    @BeforeClass
    public static void setup() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(CLASS_PATH);
        launcher.getEnvironment().setComplianceLevel(17);
        launcher.buildModel();

        CtModel model = launcher.getModel();
        classesFound = model.getElements(
                new TypeFilter<>(CtClass.class));
    }

    @Test
    public void verifyAmountOfClasses() {
        int expectedAmountOfClasses = 2;

        assertEquals(expectedAmountOfClasses, classesFound.size());
    }
}
