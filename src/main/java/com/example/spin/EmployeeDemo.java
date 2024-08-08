package com.example.spin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "raja", 25);
        Employee e2 = new Employee(2, "raja", 25);

        List<Employee> elist = Arrays.asList(e1, e2);
        System.out.println(e1.equals(e2));
        final var eMap = elist.stream().collect(Collectors.toMap(e->e, Employee::getId));

        System.out.println(eMap);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
