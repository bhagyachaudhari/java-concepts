package org.example.interview.outputbased.oop;

public class Q35 {

    void show(int x) {
        System.out.println("int");
    }

    void show(long x) {
        System.out.println("long");
    }

    void show1(long x) {
        System.out.println("long");
    }

    void show1(Integer x) {
        System.out.println("Integer");
    }

    void show3(Integer x) {
        System.out.println("Integer");
    }

    void show3(int... x) {
        System.out.println("Varargs");
    }

    static void main() {
        Q35 obj = new Q35();
        obj.show(10);
        obj.show1(10);
        obj.show3(10);
    }
}
