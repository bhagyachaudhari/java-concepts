package org.example.interview.outputbased.string;

public class Client2 {

    static void main() {
        String s1 = new String("World");
        String s2 = s1.intern();
        String s3 = "World";

        System.out.println(s2 == s3); // true — both refer to pooled object

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true (cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false (not cached)
    }
}
