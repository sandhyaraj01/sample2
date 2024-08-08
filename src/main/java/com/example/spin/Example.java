package com.example.spin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        List<List<Integer>> intPairList = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 2), Arrays.asList(2, 4),
                Arrays.asList(2, 1), Arrays.asList(5, 6), Arrays.asList(4, 2));

        final var newList = new ArrayList<Integer>();

        for (int i = 0; i <= intPairList.size() - 1; i++) {
            for (int j = i; j <= intPairList.size() - 1; j++) {
                List<Integer> a = intPairList.get(i);
                List<Integer> b = intPairList.get(j);

                if (a.get(0).intValue() == b.get(1).intValue() && a.get(1).intValue() == b.get(0).intValue()) {
                    newList.add(j);
                }

            }
        }

        List<List<Integer>> filteredList = new ArrayList<>();
        for (int k = 0; k <= intPairList.size() - 1; k++) {
            if (!newList.contains(k)) {
                filteredList.add(intPairList.get(k));
            }
        }

        System.out.println(filteredList);


        /*Problem Statement: Count the no of each characters present in the string
const myStr = 'COUNTMYCHARACTERS';
        Expected Output:
        {C:3, O:1, etc.., }*/

        final var name = "COUNTMYCHARACTERS";

        name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);


    }
}
