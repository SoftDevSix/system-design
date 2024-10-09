package org.example;
class Animal {

    public void eat() {
        System.out.println("I can eat");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    // overriding the eat() method
    @Override
    public void eat() {

        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}

class Cat extends Animal {
    @Override
    public void eat(){
        super.eat();
        System.out.println("I eat cat food");
    }

    public void miau(){
        System.out.println("I can maullar");
    }
}

class House{
    Animal animal;
    public House(Animal animal){
        this.animal = animal;
    }
    public void Dog(){
        if (animal instanceof Dog) {
            ((Dog) animal).bark();
        } else {
            System.out.println("There is no Dog");
        }
    }
}

class MainExample {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog labrador = new Dog();

        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}

