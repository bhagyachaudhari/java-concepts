package org.example.interview.outputbased.oop;

public class Q2 {

    static void show(int x) {
        System.out.println("single int");
    }

    static void show(int... x) {
        System.out.println("int varargs");
    }

    public static void main(String[] args) {
        show(5);      // Calls show(int) — exact match wins
        show(1, 2, 3); // Calls show(int...) — must use varargs
    }
}
