package org.example.tests_for_classes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;
import java.util.HashSet;
import java.util.Set;

public class AstSingleClassTest {

    private static final String CLASS_PATH = "src/main/java/org/example/modules_to_analyze/StringManipulator.java";
    private static CtClass<?> classFound;
    private static Launcher launcher;

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
    public void verifyClassName() {
        String expectedClassName = "StringManipulator";

        assertNotNull(classFound);
        assertEquals(expectedClassName, classFound.getSimpleName());
    }

    @Test
    public void verifyClassSource() {
        String expectedSourceFile = "StringManipulator.java";

        assertNotNull(classFound);
        assertEquals(expectedSourceFile, classFound.getPosition().getFile().getName());
    }

    @Test
    public void verifyClassFields() {
        String defaultField = "MAX_LENGHT";
        int expectedAmountOfFields = 2;
        CtTypeReference<Integer> expectedDefaultFieldType = launcher.getFactory().Type().INTEGER_PRIMITIVE;
        Set<ModifierKind> expectedDeafultFieldModifiers = new HashSet<ModifierKind>();
        expectedDeafultFieldModifiers.addAll(
                List.of(
                        ModifierKind.FINAL,
                        ModifierKind.PUBLIC,
                        ModifierKind.STATIC));

        assertNotNull(classFound);
        assertEquals(expectedAmountOfFields, classFound.getAllFields().size());
        classFound.getAllFields().forEach(arg0 -> {
            if (arg0.getSimpleName().equals(defaultField)) {
                assertEquals(expectedDefaultFieldType, arg0.getType());
                assertTrue(arg0.getModifiers().containsAll(expectedDeafultFieldModifiers));
            }
        });
    }

}
