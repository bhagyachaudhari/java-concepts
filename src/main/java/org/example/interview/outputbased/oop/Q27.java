package org.example.interview.outputbased.oop;

class Parent20 {
    Parent20() {
        show();
    }

    void show() {
        System.out.println("Parent");
    }
}

class Child20 extends Parent20 {
    int x = 10;

    @Override
    void show() {
        System.out.println(x);
    }
}

public class Q27 {
    static void main() {

        new Child20();
    }
}
