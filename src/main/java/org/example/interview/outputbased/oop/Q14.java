package org.example.interview.outputbased.oop;

abstract class Animal {
    abstract void makeSound(); // Abstract method (no body)
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class Q14 {
    static void main() {
        Animal d = new Dog();
        d.makeSound();

        Dog d1 = new Dog();
        d1.makeSound();
    }
}
