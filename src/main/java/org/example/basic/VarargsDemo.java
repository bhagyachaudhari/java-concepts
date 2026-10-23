package org.example.basic;

class VarargsDemo {
    static void printNumbers(int... numbers) {
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    static void greet(String message, String... names) {
        for (String name : names) {
            System.out.println(message + ", " + name);
        }
        System.out.println();
    }

    void example(int a, String... strs) { }   // ✅ valid
    //void invalid(String... strs, int a) { }   // ❌ invalid

    public static void main(String[] args) {
        printNumbers();                // no arguments
        printNumbers(1);               // one argument
        printNumbers(1, 2, 3, 4, 5);   // multiple arguments

        greet("Hello");                          // no varargs
        greet("Hi", "Alice");                    // one name
        greet("Welcome", "Bob", "Charlie");      // multiple names
    }
}
