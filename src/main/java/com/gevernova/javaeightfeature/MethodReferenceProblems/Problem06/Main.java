package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Predicate<String,String> p= new Predicate<String,String>() {
            @Override
            public Boolean checkA(String s) {
                return s.toLowerCase().contains("a");
            }
        };
        List<String> list = List.of("Ajaya","ravi","shivam");
        list.stream().filter(p::checkA).forEach(System.out::println);

    }
}
