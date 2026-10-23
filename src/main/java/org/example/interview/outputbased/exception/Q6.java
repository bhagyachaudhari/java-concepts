package org.example.interview.outputbased.exception;

public class Q6 {
    static int test() {
        try {
            return 10;
        } finally {
            return 20;
        }
    }

    void main() {
        System.out.println(test());
    }
}
