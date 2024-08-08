package com.example.practice;

import org.springframework.util.StringUtils;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate {

    public static void main(String[] args) {

        String name = "India is a great country";

        final var map = name.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()));

        map.entrySet().stream().filter(m-> StringUtils.hasText(String.valueOf(m.getKey())) && m.getValue()>1).forEach(System.out::println);
    }
}
