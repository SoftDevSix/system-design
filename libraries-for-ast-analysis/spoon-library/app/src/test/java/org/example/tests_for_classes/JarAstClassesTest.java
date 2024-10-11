package org.example.tests_for_classes;

import org.junit.BeforeClass;
import org.junit.Test;
import spoon.JarLauncher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JarAstClassesTest {

    private static final String JAR_PATH = "src/test/resources/jarprj-1.0-SNAPSHOT.jar";
    private static JarLauncher launcher;
    private static List<CtClass<?>> classesFound;

    @BeforeClass
    public static void setUp() {
        launcher = new JarLauncher(JAR_PATH);
        launcher.buildModel();

        CtModel model
                = launcher
                .getModel();
        classesFound = model.getElements(
                new TypeFilter<>(CtClass.class));
    }

    @Test
    public void verifyAstJarClassesFound() {
        List<String> expectedClassesFound = new ArrayList<>(List.of(
                "Main",
                "StringManipulator",
                "StringReceiver",
                "IdHandler"
        ));

        assertEquals(expectedClassesFound.size(), classesFound.size());
        classesFound.forEach(classFound -> {
            expectedClassesFound.remove(classFound.getSimpleName());
        });

        boolean allClassesWereFound = expectedClassesFound.isEmpty();
        assertTrue(allClassesWereFound);
    }

}
