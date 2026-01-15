package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem08;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new Random()
                .ints(5, 18, 60)
                .mapToObj(Person::new) // constructor reference
                .collect(Collectors.toList());

        people.forEach(System.out::println);
    }
}
