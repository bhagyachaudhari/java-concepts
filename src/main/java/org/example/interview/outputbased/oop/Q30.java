package org.example.interview.outputbased.oop;

class Parent23 {
    void show(Object obj) {
        System.out.println("Parent Object");
    }
}

class Child23 extends Parent23 {
    void show(String str) {
        System.out.println("Child String");
    }
}

public class Q30 {
    static void main() {

        Parent23 p = new Child23();
        p.show("Java");
    }
}
