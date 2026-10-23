package org.example.interview.outputbased.oop;


class Parent30 {

    {
        System.out.println("Parent block");
    }

    Parent30() {
        System.out.println("Parent constructor");
    }
}

class Child30 extends Parent30 {

    {
        System.out.println("Child block");
    }

    Child30() {
        System.out.println("Child constructor");
    }
}


public class Q36 {

    static void main() {

        new Child30();

    }
}
