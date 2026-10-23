package org.example.interview.outputbased.oop;

class Parent8 {
    public static void display() {
        System.out.println("Parent static method");
    }
}

class Child8 extends Parent8 {
    public static void display() { // Method Hiding, not Overriding
        System.out.println("Child static method");
    }
}

public class Q22 {
    public static void main(String[] args) {
        Parent8 obj = new Child8();
        obj.display(); // Output: Parent static method (Method Hiding)
    }
}

