package org.example.interview.outputbased.oop;


interface A5{
    default void show() {
        System.out.println("A");
    }
}

interface B5 {
    default void show() {
        System.out.println("B");
    }
}

//class C5 implements A5, B5 {
//}

public class Q34 {
}
