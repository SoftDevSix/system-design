package org.example.tests_for_processor;

import org.example.processors.CatchProcessor;
import org.junit.Test;

import spoon.Launcher;

public class CatchProcessorTest {
    
    private final String CLASS_PATH = "src/main/java/org/example/modules_to_analyze/NumberHandler.java";

    @Test
    public void verifyEmptyCatchAnalysis() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(CLASS_PATH);
        CatchProcessor processor = new CatchProcessor();
        launcher.addProcessor(processor);
        launcher.buildModel();
        launcher.process();
    }
}
