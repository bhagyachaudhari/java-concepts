package org.example.interview.outputbased.oop;

interface Vehicle {}

class Car implements Vehicle {}

public class Q6 {

    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v instanceof Car);       // true
        System.out.println(v instanceof Vehicle);   // true

        String s = null;
        System.out.println(s instanceof String);  // false
    }

}
