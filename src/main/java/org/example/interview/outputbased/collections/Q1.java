package org.example.interview.outputbased.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {

        List<Integer> list =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        for (Integer n : list) {
            if (n == 2) {
                list.remove(n);
            }
        }

        System.out.println(list);
    }
}
