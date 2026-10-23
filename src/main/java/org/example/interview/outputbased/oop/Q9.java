package org.example.interview.outputbased.oop;

class Parent1 {
    protected void show() {
        System.out.println("Protected method in Parent");
    }
}

class Child1 extends Parent1 {
    public void show() { // Allowed (protected → public)
        System.out.println("Public method in Child");
    }
}

public class Q9 {
    static void main() {
        new Child1().show();
    }
}
