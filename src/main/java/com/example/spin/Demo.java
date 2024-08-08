package com.example.spin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        //merge unsorted arrays without duplicates

        int a[] = {1,2,4,6,7};
        int b[] = {3,6,9,10,4};

        final var aList = Arrays.stream(a).boxed().distinct().toList();
        final var bList = Arrays.stream(b).boxed().distinct().toList();

        List<List<Integer>> cList = new ArrayList<>();
        cList.add(aList);
        cList.add(bList);
        cList.stream().flatMap(List::stream).sorted().distinct().forEach(System.out::println);


    }

}
