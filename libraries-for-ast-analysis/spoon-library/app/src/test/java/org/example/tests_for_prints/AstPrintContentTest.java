package org.example.tests_for_prints;

import org.junit.Test;

import spoon.Launcher;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.reflect.visitor.DefaultTokenWriter;

public class AstPrintContentTest {

    private static final String path = "src/main/java/org/example/modules_to_analyze";

    @Test
    public void printClassFound() {
        Launcher launcher = new Launcher();
        launcher.addInputResource(path);
        launcher.getEnvironment().setComplianceLevel(17);
        launcher.getEnvironment().setAutoImports(true);
        launcher.getFactory().getEnvironment().setPrettyPrinterCreator(() -> getPrinter(launcher));
        launcher.run();
    }

    private DefaultJavaPrettyPrinter getPrinter(Launcher launcher) {
        DefaultJavaPrettyPrinter defaultJavaPrettyPrinter = new DefaultJavaPrettyPrinter(
                launcher.getFactory().getEnvironment());
        defaultJavaPrettyPrinter.setPrinterTokenWriter(getTokenPrinter());
        return defaultJavaPrettyPrinter;
    }

    private DefaultTokenWriter getTokenPrinter() {
        return new DefaultTokenWriter() {
            @Override
            public DefaultTokenWriter writeKeyword(String token) {
                getPrinterHelper().write(token);
                return this;
            }
        };
    }
}
