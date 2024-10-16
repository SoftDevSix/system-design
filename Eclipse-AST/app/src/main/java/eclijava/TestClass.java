package eclijava;

public class TestClass {
    // method test
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public int sum(int num1, int num2) {
        System.out.println(num1);
        return num1 + num2;
    }

    public double product(int num1, int num2) {
        var a = num1 * num2;
        return a;
    }

    public double divide(int num1, int num2, int num3) {
        product(num1, num2);
        int num4 = 3;
        var num5 = 0;
        for (int i = 0; i < 2; i++) {
            num5 = num1 * num2;
            System.out.println(num5);
        }
        return num5;
    }
}
