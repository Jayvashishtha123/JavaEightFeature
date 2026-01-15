package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem08;

class Person {
    int age;

    Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person age: " + age;
    }
}