package org.example.interview.outputbased.oop;

class Parent {

    int x = 10;

    Parent() {
        System.out.println("Parent");
    }

    protected static void show() {
        System.out.println("Protected Static Method");
    }
}
class Child extends Parent {

    int x = 20;

    Child() {
        System.out.println("Child");
    }

    protected static void show() {  // This is NOT overriding, but hiding
        System.out.println("Child Static Method");
    }
}

public class Q7 {
    static void main() {

        Parent p = new Child();
        p.show();
        System.out.println(p.x);

        Child c = new Child();
        c.show();
        System.out.println(c.x);

        System.out.println(p instanceof Parent);
        System.out.println(p instanceof Child);
    }
}
