package com.gevernova.javaeightfeature.MethodReferenceProblems;

import java.util.Arrays;
import java.util.List;

public class Problem07 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "stream", "method", "reference");

        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
