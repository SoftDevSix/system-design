package org.example.processors;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCatch;

public class CatchProcessor extends AbstractProcessor<CtCatch> {

    @Override
    public void process(CtCatch element) {
        if (element.getBody().getStatements().isEmpty()) {
            System.out.println("WARN: Inline empty catch block "
                    + element.getPosition().getLine());
        }
    }
}
