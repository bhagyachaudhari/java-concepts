package org.example.interview.outputbased.oop;

class Counter {
    static int count = 0; // Shared by all instances

    Counter() { count++; } // Increment count on each object creation
}

public class Q13 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.count); // Output: 3
    }
}
