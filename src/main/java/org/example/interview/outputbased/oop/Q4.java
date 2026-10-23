package org.example.interview.outputbased.oop;

public class Q4 {

    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block executed");
    }

    // Constructor
    Q4 () {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        Q4 obj1 = new Q4();
        Q4 obj2 = new Q4();
    }

}

