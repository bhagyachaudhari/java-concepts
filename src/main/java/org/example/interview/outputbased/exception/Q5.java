package org.example.interview.outputbased.exception;

public class Q5 {
    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("Finally");
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}