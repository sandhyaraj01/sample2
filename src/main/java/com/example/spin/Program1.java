package com.example.spin;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program1 {

    public static void main(String[] args) {

        /*Write a program using Java 8, to group the last name and the no. of occurrences in the list.
                Input - Full name list -> {Ravi Kumar, Neha Gupta, Arti Gupta, Kamal Rai}
        Output - Kumar - 1, Gupta - 2, Rai - 1*/

        /*List<String> list = Arrays.asList("Ravi Kumar", "Neha Gupta", "Arti Gupta", "Kamal Rai");

        final var sMap = list.stream().map(s -> s.substring(s.indexOf(" ") + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(sMap);*/


        List<List<Integer>> intPairList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 2), Arrays.asList(2, 4),
                Arrays.asList(2, 1), Arrays.asList(5, 6), Arrays.asList(4, 2));

        Set<String> seen = new HashSet<>();
        List<List<Integer>> filteredList = new ArrayList<>();

        for (List<Integer> pair : intPairList) {
            String original = pair.get(0) + "," + pair.get(1);
            String reverse = pair.get(1) + "," + pair.get(0);

            if (!seen.contains(reverse)) {
                seen.add(original);
                filteredList.add(pair);
            }
        }

        System.out.println("Original list: " + intPairList);
        System.out.println("Filtered list: " + filteredList);

            }
}
