package org.example.interview.outputbased.oop;

public class Q3 {

    static void print(Object... objs) {
        System.out.println("Object varargs");
    }

    static void print(String str) {
        System.out.println("Single String");
    }

    public static void main(String[] args) {
        print("Hello");     // Calls print(String) — exact match
        print("A", "B");   // Calls print(Object...) — must use varargs
    }
}
