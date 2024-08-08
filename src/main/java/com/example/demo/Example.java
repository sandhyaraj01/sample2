package com.example.demo;

import java.util.Arrays;

public class Example {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 9, 1};
        int n = arr.length - 1;
        Arrays.stream(arr).forEach(System.out::println);

        while (n >= 0) {
            if (arr[n] < 9) {
                arr[n] += 1;
                break;
            } else {
                arr[n] = 0;
            }
            n--;
        }
        Arrays.stream(arr).forEach(System.out::println);


    }
}
