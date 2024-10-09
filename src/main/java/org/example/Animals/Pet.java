package org.example.Animals;

public class Pet {
    protected String name;
    protected int age;

    public Pet (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void Eat() {
        System.out.println("the pet " + this.name + " is eating");
    }
    public void ShowAge() {
        System.out.println("the pet " + this.name + " is " + this.age + " years old");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
