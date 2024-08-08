package com.example.demo;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {

        int num = 123;
        boolean isPrime = false;
        int temp;
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = true;
                break;
            }
        }

        if (isPrime) {
            System.out.println("yes prime");
        } else {
            System.out.println("not prime");
        }

        Integer[] arr = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };

        final var secondMax = Arrays.stream(arr).sorted(Collections.reverseOrder()).toList()
                .stream().distinct().skip(2).limit(1).findFirst();
        System.out.println(secondMax);

        int n = 153;
        int amNumber = n;
        int sum = 0;
        while (n > 0) {
            int c = n % 10;
            sum += (int) Math.pow(c, String.valueOf(amNumber).toCharArray().length);
            n /= 10;
        }
        System.out.println(sum);

        String str1 = "Saket Saurav        is a QualityAna    list";

        final var str3 = Arrays.stream(str1.split(" ")).filter(StringUtils::hasText).collect(Collectors.joining(" "));
        System.out.println(str3);
        var str2= str1.replace(" ","");
        System.out.println(str2);

    }
}
