package org.example.interview.outputbased.string;

public class Client4 {

    static void main() {
        String s1 = "Ja" + "va";
        String s2 = "Java";

        System.out.println(s1 == s2);

        String a = "Ja";
        String b = "va";
        String s3 = "Java";
        String s4 = a + b;

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}
