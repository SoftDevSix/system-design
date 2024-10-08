package org.example.sample;

public class Hello {
    private static void sayHiToMaxVerstappen() {
        System.out.println("Hello, Max Verstappen!!");
    }

    private static String checoPerez() {
        return "Checho Perez just takes the victory";
    }

    public static void main(String[] args) {
        System.out.println("GREETINGS");
        sayHiToMaxVerstappen();

        String perez = checoPerez();
        System.out.println(perez);

        String redBull = "FROM RED BULL RACING";
    }
}
