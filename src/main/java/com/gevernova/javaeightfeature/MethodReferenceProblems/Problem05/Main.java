package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem05;

import java.util.*;

public class Main {

    // Generic method...........
    public static <T> T findMax(List<T> list, Comparator<T> comparator) {
        return Collections.max(list, comparator);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 40, 203, 30);

        // Using Method reference method with the generic Method........
        Integer max = findMax(numbers, Integer::compareTo);
        System.out.println("Maximum: " + max);
    }
}
