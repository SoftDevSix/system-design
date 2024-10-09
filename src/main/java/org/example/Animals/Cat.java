package org.example.Animals;

public class Cat extends Pet {
    private final boolean isSleep;
    public Cat(String name, int age, boolean isSleep) {
        super(name, age);
        this.isSleep = isSleep;
    }

    public String isSleep() {
        return this.isSleep ? "cat is sleep." : "cat is not sleep.";
    }

    @Override
    public void ShowAge() {
        super.ShowAge();
        System.out.println(this.age > 3 ? "this cat is an adult!" : "this cat is young");
    }
}
