package org.coverage;
import java.lang.instrument.Instrumentation;

/**
 * Created by Yifan on 10/28/16.
 * transform input byte[], output[],
 * asm works inside transformer,
 * TODO the question is how to get # of statement, both covered and uncovered??
 */


/**
 * The strategy for regular classes adds a static field to hold the probe array
 * and a static initialization method requesting the probe array from the
 * runtime.
 * <p>
 * Add a method call to this static methon after each bytecode statement call.
 * TODO the problem is: what's the parameters of the static method?
 */
public class Agent {
    public static void premain(String agentArgs, Instrumentation inst) {
        CoverageDriver transformer = new CoverageDriver(agentArgs);
        inst.addTransformer(transformer);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                CoverageDriver.printResult();
                System.out.println("Agent has exited, after printing results");
            }
        });
        System.out.println("Agent has exited");
    }

    public static void main(String[] args) {

    }
}
