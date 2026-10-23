package org.example.interview.outputbased.oop;

class Address5 {
    String city;

    Address5(String city) {
        this.city = city;
    }

    // Custom method to create a deep copy of Address
    public Address5 deepCopy() {
        return new Address5(this.city);
    }
}

class Person5 {
    String name;
    Address5 address;

    Person5(String name, Address5 address) {
        this.name = name;
        this.address = address;
    }

    // Manual deep copy method
    public Person5 deepCopy() {
        return new Person5(this.name, this.address.deepCopy());
    }
}

public class Q18 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address5 addr1 = new Address5("New York");
        Person5 p1 = new Person5("Alice", addr1);

        // Create a deep copy
        Person5 p2 = p1.deepCopy();

        // Modify deep copy
        p2.name = "Bob";
        p2.address.city = "Los Angeles";

        System.out.println(p1.name);          // Alice (unchanged)
        System.out.println(p1.address.city);  // New York (unchanged)

        System.out.println(p2.name);          // Bob
        System.out.println(p2.address.city);  // Los Angeles
    }
}
