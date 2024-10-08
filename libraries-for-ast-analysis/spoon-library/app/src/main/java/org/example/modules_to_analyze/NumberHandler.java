package org.example.modules_to_analyze;

public class NumberHandler {

    private double number;

    public NumberHandler(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    protected void printProtectedMethod() {
        System.out.println("Protected method");
    }

    private void failProcess() throws Exception {
        throw new Exception("process failed");
    }

    public void performProcess() {
        try {
            failProcess();
        } catch (Exception e) {

        }
    }

    public void anotherPerformProcess(int limit) {
        try {
            lazilyIncrease(limit);
        } catch (Exception e) {

        }
    }

    public double lazilyIncrease(int limit) {
        for (int i = 0; i < limit; i++) {
            number++;
        }

        return number;
    }

}
