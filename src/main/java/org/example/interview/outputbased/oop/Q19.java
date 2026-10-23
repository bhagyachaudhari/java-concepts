package org.example.interview.outputbased.oop;

class Test {
    int sum(int a, int b) {
        return a + b;
    }

    /* double sum(int a, int b) {  // Not allowed (Only return type changed)
        return a + b;
    }*/
}

public class Q19 {
    public static void main(String[] args) {
        Test obj = new Test();
        //obj.sum(5, 10);  // Which method should be called? Compiler error!
    }
}

