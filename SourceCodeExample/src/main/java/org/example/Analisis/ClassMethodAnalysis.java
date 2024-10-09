package org.example.Analisis;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.body.TypeDeclaration;

import java.util.List;
import java.util.Optional;

public class ClassMethodAnalysis implements Analysis {
    CompilationUnit cu;

    public ClassMethodAnalysis(CompilationUnit cu) {
        this.cu = cu;
    }

    @Override
    public void AnalysisReport() {
        try {
            // Recorre todas las clases o interfaces del archivo de código fuente.
            // 'cu' es una instancia de CompilationUnit que contiene la representación del archivo de código fuente.
            for (TypeDeclaration<?> type : cu.getTypes()) {

                // Obtiene la posición de inicio y fin de la declaración de la clase o interfaz en el archivo.
                Optional<com.github.javaparser.Position> classStart = type.getBegin();
                Optional<com.github.javaparser.Position> classEnd = type.getEnd();

                // Verifica si la posición de inicio y fin está presente (si se pudo obtener correctamente).
                if (classStart.isPresent() && classEnd.isPresent()) {
                    // Imprime el nombre de la clase o interfaz y las líneas en las que se define.
                    System.out.println("Clase: " + type.getName() + " de la línea: " + classStart.get().line +
                            " a la línea: " + classEnd.get().line);
                } else {
                    // Si no se pudo determinar la posición de la clase, se notifica.
                    System.out.println("No se pudo determinar la posición de la clase: " + type.getName());
                }

                // Recorre los miembros de la clase, que pueden ser métodos, variables, constructores, etc.
                List<BodyDeclaration<?>> members = type.getMembers();
                for (BodyDeclaration<?> member : members) {
                    // Verifica si el miembro actual es un método (instanceof determina el tipo en tiempo de ejecución).
                    if (member instanceof MethodDeclaration) {
                        MethodDeclaration method = (MethodDeclaration) member;

                        // Obtiene la posición de inicio y fin de la declaración del método.
                        Optional<com.github.javaparser.Position> methodStart = method.getBegin();
                        Optional<com.github.javaparser.Position> methodEnd = method.getEnd();

                        // Verifica si se pudo obtener la posición del método.
                        if (methodStart.isPresent() && methodEnd.isPresent()) {
                            // Imprime el nombre del método, las líneas de inicio y fin, y los parámetros que recibe.
                            System.out.println("Método: " + method.getName() + " de la línea: " + methodStart.get().line +
                                    " a la línea: " + methodEnd.get().line +
                                    " (parámetros: " + method.getParameters() + ")");
                        } else {
                            System.out.println("No se pudo determinar la posición del método: " + method.getName());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
