package org.example.tests_for_processor;

import org.example.processors.CatchProcessor;
import org.junit.Test;

import spoon.JarLauncher;
import spoon.Launcher;
import spoon.decompiler.ProcyonDecompiler;

public class CatchProcessorTest {

    @Test
    public void verifyEmptyCatchAnalysis() {
        String classPath = "src/main/java/org/example/modules_to_analyze/NumberHandler.java";
        Launcher launcher = new Launcher();
        launcher.addInputResource(classPath);
        CatchProcessor processor = new CatchProcessor();
        launcher.addProcessor(processor);
        launcher.buildModel();
        launcher.process();
    }

    @Test
    public void verifyEmptyCatchAnalysisFromJar() {
        String jarPath = "src/test/resources/jarprj-1.0-SNAPSHOT.jar";
        JarLauncher launcher = new JarLauncher(jarPath, null, null, new ProcyonDecompiler());
        launcher.addInputResource(jarPath);
        CatchProcessor processor = new CatchProcessor();
        launcher.addProcessor(processor);
        launcher.buildModel();
        launcher.process();
    }
}
