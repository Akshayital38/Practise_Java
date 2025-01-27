package com.ibm.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
