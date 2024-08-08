package com.example.practice;

import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumber {

    public static void main(String[] args) {

        // 10 numbers 1,2,3,4,5,3,3,4,6,7 unique elements

        List<Integer> alist = List.of(1,2,3,4,5,3,3,4,6,7);

        final var distinctList = alist.stream().distinct().filter(i->i%2==0).collect(Collectors.toList());

        for(int i: distinctList) {

            if(i%2==0){
                System.out.println(i);
            }
        }

        //System.out.println(distinctList);
    }
}
