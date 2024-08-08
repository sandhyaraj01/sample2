package com.example.spin;

import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;

    public static void main(String[] args) {

        String name = "Senior Software Eng";

        final var mapOfChars = name.toUpperCase().chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        final var nonRepeated = mapOfChars.entrySet().stream().filter(map -> map.getValue() == 1).findFirst();

        nonRepeated.ifPresent(System.out::println);


    }

}
