package org.example.interview.coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersStartingWithOne
{
    public static void main(String[] args) {

        List<Integer> numbers = IntStream.rangeClosed(100, 200)
                .filter(number -> String.valueOf(number).startsWith("1"))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}