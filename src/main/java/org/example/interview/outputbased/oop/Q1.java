package org.example.interview.outputbased.oop;

class Q1 {

    static void print(int... nums) {

        System.out.println("int varargs");
    }

    static void print(long... nums) {

        System.out.println("long varargs");
    }

    public static void main(String[] args) {

        print(1);   // ❓ Which one? int... or long...
    }
}
