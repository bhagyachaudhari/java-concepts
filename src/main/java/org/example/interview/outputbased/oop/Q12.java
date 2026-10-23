package org.example.interview.outputbased.oop;

public class Q12 {
    final int MAX_USERS = 100; // Constant

    void updateLimit() {
        // MAX_USERS = 200; // Compilation error: cannot change final variable
    }
}

class Parent3 {
    final void display() {
        System.out.println("Cannot be overridden");
    }
}

class Child3 extends Parent3 {
    // void display() { } // Compilation error
}

final class Utility {
    void show() { System.out.println("Utility class"); }
}

// class ExtendedUtility extends Utility { } // Compilation error
