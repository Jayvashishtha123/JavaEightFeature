package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3,4,5,6,7,7,8,9,8));
        // Using static method reference :- ClassName::methodName
        list.stream().map(Square::square).forEach(System.out::println);
    }
}
