package org.example.interview.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

    static void main() {

        List<String> words = Arrays.asList(
                "eat", "tea", "tan", "ate", "nat"
        );

        Map<String, List<String>> groupedAnagrams =
                words.stream()
                        .collect(Collectors.groupingBy(word -> {
                            char[] chars = word.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        }));

        System.out.println(groupedAnagrams.values());

    }
}
