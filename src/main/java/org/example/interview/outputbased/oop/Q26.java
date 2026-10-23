package org.example.interview.outputbased.oop;


interface A1 {
    default void show() {
        System.out.println("A");
    }
}

interface B1 extends A1 {
    default void show() {
        System.out.println("B");
    }
}

interface C1 extends A1 {
    default void show() {
        System.out.println("C");
    }
}

class D1 implements B1, C1 {
    // Must override show() to resolve conflict
    public void show() {
        B1.super.show(); // explicitly choose one
    }
}

public class Q26 {
    public static void main(String[] args) {
        new D1().show();  // Output: B
    }
}

