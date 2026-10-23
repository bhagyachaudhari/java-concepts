package org.example.interview.outputbased.oop;

class Person1 {
    String name;
}

public class Q16 {
    public static void modify(Person1 p) {
        p = new Person1();  // New object, but only affects local reference
        p.name = "Alice";
    }

    public static void main(String[] args) {
        Person1 person = new Person1();
        person.name = "Bob";

        modify(person);
        System.out.println(person.name);  // Output: Bob (original reference unchanged)
    }
}
