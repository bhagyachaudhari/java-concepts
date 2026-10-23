package org.example.interview.outputbased.oop;

class Parent21 {
    int x = 10;

    Parent21() {
        System.out.println(x);
    }
}

class Child21 extends Parent21 {
    int x = 20;

    Child21() {
        System.out.println(x);
    }
}


public class Q28 {
    static void main() {
        new Child21();
    }
}
