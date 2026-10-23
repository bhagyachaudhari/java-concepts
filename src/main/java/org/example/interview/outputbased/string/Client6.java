package org.example.interview.outputbased.string;

public class Client6 {

    void show(Object o) {
        System.out.println("Object");
    }
    void show(String s) {
        System.out.println("String");
    }

    static void main() {
        new Client6().show(null);
    }
}
