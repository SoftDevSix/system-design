package org.example.Animals;

public class Dog extends Pet {

    private final boolean isHappy;
    public Dog(String name, int age, boolean isHappy ) {
        super(name, age);
        this.isHappy = isHappy;
    }

    public void isHappy() {
        System.out.println(this.isHappy ? "Happy" : "Not happy");
    }

}
