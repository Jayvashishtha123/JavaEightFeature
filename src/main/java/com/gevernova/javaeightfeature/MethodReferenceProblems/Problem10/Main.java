package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem10;

public class Main {
    static void main(String[] args) {
        Calculator addition = Operations::add;
        Calculator subtraction = Operations::subtract;
        Calculator multiplication = Operations::multiply;
        Calculator division = Operations::divide;

        System.out.println("Addition: " + addition.calculate(10, 5));
        System.out.println("Subtraction: " + subtraction.calculate(10, 5));
        System.out.println("Multiplication: " + multiplication.calculate(10, 5));
        System.out.println("Division: " + division.calculate(10, 5));
    }
}
