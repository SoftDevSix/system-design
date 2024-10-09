package org.example.tests_for_classes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import java.util.List;
import java.util.ArrayList;

public class AstClassesAsTextPlainTest {
    private static List<CtClass<?>> classesFound = new ArrayList<>();

    @BeforeClass
    public static void setup() {
        String class1 = "package org.example; public class FirstClass { public void sayHello() { System.out.println(\"Hello from FirstClass\"); } }";
        String class2 = "package org.example; public class SecondClass { public void greet() { System.out.println(\"Hello from SecondClass\"); } }";

        CtClass<?> firstClass = Launcher.parseClass(class1);
        CtClass<?> secondClass = Launcher.parseClass(class2);

        classesFound.add(firstClass);
        classesFound.add(secondClass);
    }

    @Test
    public void verifyAmountOfClasses() {
        int expectedAmountOfClasses = 2;

        assertEquals(expectedAmountOfClasses, classesFound.size());
    }

    @Test
    public void verifyFirstClassMethodName() {
        CtClass<?> firstClass = classesFound.stream()
                .filter(ctClass -> ctClass.getSimpleName().equals("FirstClass"))
                .findFirst().orElseThrow();

        String expectedMethodName = "sayHello";

        assertEquals(expectedMethodName, firstClass.getMethods().iterator().next().getSimpleName());
    }

    @Test
    public void verifySecondClassMethodName() {
        CtClass<?> secondClass = classesFound.stream()
                .filter(ctClass -> ctClass.getSimpleName().equals("SecondClass"))
                .findFirst().orElseThrow();

        String expectedMethodName = "greet";

        assertEquals(expectedMethodName, secondClass.getMethods().iterator().next().getSimpleName());
    }
}
