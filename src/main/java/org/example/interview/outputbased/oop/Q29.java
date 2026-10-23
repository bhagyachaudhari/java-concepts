package org.example.interview.outputbased.oop;


class Parent22 {

    void show() {
        System.out.println("Parent");
    }

}

class Child22 extends Parent22 {

    @Override
    void show() {
        System.out.println("Child");
    }

}


public class Q29 {

    static void main() {

        Parent22 p = new Child22();
        p.show();

        Parent22 p1 = new Child22();
        Child22 c1 = (Child22) p1;
        c1.show();

        Parent22 p2 = new Parent22();
        Child22 c2 = (Child22) p2;
    }
}
