package org.example.interview.outputbased.oop;

class Parent24 {
    public void show() {
        System.out.println("Parent");
    }

    void test() {
        show();
    }
}

class Child24 extends Parent24 {
    public void show() {
        System.out.println("Child");
    }
}


public class Q32 {
    static void main() {
        Child24 c = new Child24();
        c.test();

    }
}
