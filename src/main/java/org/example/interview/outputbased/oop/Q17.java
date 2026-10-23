package org.example.interview.outputbased.oop;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person2 implements Cloneable {
    String name;
    Address address;

    Person2(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // only the top-level object is cloned
    }
}

public class Q17 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person2 p1 = new Person2("Alice", addr);

        Person2 p2 = (Person2) p1.clone();

        // Modifying the shared reference
        p2.address.city = "Los Angeles";
        p2.name = "Bob";

        System.out.println(p1.address.city); // Los Angeles (changed!)
        System.out.println(p2.address.city); // Los Angeles

        System.out.println(p1.name);
        System.out.println(p2.name);
    }

}
