package org.example.interview.outputbased.oop;

public class Q31 {

    void show(Object o) {
        System.out.println("Object");
    }

    void show(String s) {
        System.out.println("String");
    }

    void display(String s) {
        System.out.println("String");
    }

    void display(Integer i) {
        System.out.println("Integer");
    }

    static void main() {
        Q31 obj = new Q31();
        obj.show(null);
        //obj.display(null); // Compilation error
    }
}
