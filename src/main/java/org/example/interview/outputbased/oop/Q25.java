package org.example.interview.outputbased.oop;


class A {
    void show() {
        System.out.println("Class A");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends A {
    void show() {
        System.out.println("Class C");
    }
}

// ❌ Java does NOT allow this
// class D extends B, C { }

public class Q25 {


}
