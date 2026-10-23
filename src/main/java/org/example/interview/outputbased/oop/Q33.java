package org.example.interview.outputbased.oop;


class Parent25 {
    private void show() {
        System.out.println("Parent");
    }

    void test() {
        show();
    }
}

class Child25 extends Parent25 {
    public void show() {
        System.out.println("Child");
    }
}


public class Q33 {
    static void main() {
        Child25 c = new Child25();
        c.test();

    }
}
