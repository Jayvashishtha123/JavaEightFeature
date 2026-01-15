package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem03;

import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
                List<String> list = Arrays.asList("Agra", "Delhi", "Chennai", "Himalaya");

                // Sorting the list using instance method reference.......
                list.sort(String::compareToIgnoreCase);
                System.out.println(list);


    }
}
