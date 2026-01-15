package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem09;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = Optional.ofNullable(input)
                .map(String::toUpperCase)
                .orElse("NO INPUT PROVIDED");

        System.out.println(result);
    }
}
