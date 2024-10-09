package org.example;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;

public class BytecodeAnalysis {

    private static final Map<String, String> opcodeDescriptions = new HashMap<>();

    static {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/opcodes.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" - ");
                if (parts.length >= 3) {
                    String instruction = parts[0].trim();
                    String opcode = parts[1].trim();
                    String description = parts[2].trim();
                    opcodeDescriptions.put(opcode, description + " (Instruction: " + instruction + ")");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void analyze(String jarFilePath, String outputPath) {
        try {
            File jarFile = new File(jarFilePath);
            URL[] urls = {jarFile.toURI().toURL()};
            URLClassLoader classLoader = new URLClassLoader(urls);

            try (JarFile jar = new JarFile(jarFile);
                 BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
                jar.stream()
                        .filter(entry -> entry.getName().endsWith(".class"))
                        .forEach(entry -> analyzeClass(entry.getName(), writer));
            }

            classLoader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void analyzeClass(String className, BufferedWriter writer) {
        try {
            String name = className.replace('/', '.').replace(".class", "");
            ClassReader classReader = new ClassReader(name);

            classReader.accept(new ClassVisitor(Opcodes.ASM9) {
                @Override
                public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                    try {
                        writer.write("Method found: " + name + ", descriptor: " + descriptor + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return new MethodVisitor(Opcodes.ASM9) {
                        @Override
                        public void visitInsn(int opcode) {
                            try {
                                String hexOpcode = String.format("%02x", opcode).toUpperCase();
                                String description = opcodeDescriptions.getOrDefault(hexOpcode, "Unknown opcode");
                                writer.write("  Instruction opcode: " + hexOpcode + " - " + description + "\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    };
                }
            }, 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
