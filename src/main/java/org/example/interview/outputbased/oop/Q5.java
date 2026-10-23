package org.example.interview.outputbased.oop;

public class Q5 {

    {
        System.out.println("First Instance Initializer Block");
    }

    {
        System.out.println("Second Instance Initializer Block");
    }

    Q5() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        new Q5();
    }
}
