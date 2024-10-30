package com.antlr;

public class ExampleFile {
    private static void say() {
        System.out.println("Hello, Max Verstappen!!");
    }

    private static String checoPerez() {
        return "Checho Perez just takes the victory";
    }

    public static void main(String[] args) {
        System.out.println("GREETINGS");
        say();

        /**
         * javadoc
         */
        String perez = checoPerez();
        System.out.println(perez);


        //COMENTARIO
        String redBull = "FROM RED BULL RACING";
        longParameters(1,"no", 2.2, true, "yes", "2");
    }

    private static void longParameters(int num1, String par2, Double num2, boolean yes, String drink, String drink1) {
        String redBull = "FROM RED BULL RACING";
    }
}
