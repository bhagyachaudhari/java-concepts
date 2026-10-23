package org.example.interview.outputbased.string;

public class Client1 {

    static void main() {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s1 == s2); // true — same object from the pool
        System.out.println(s1 == s3); // false — 'new' forces new object
        System.out.println(s1.equals(s3)); // true — content is same
    }
}
