package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    static void main(String[] args) {
        Person p1= new Person();
        p1.setName("Jay");
        Person p2= new Person();
        p2.setName("Mudit");
        Person p3= new Person();
        p3.setName("Purvi");
        Person p4= new Person();
        p4.setName("Sani");
        Person p5= new Person();
        p5.setName("Dhruv");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        // Using instance method reference on a Particular instance...........
        list.stream().forEach(Person->
                {
                    Consumer<String> printer = System.out::println;
                    printer.accept(Person.getName());
                }
        );

        // Using instance method reference on an arbitrary instance.........
        list.stream().map(p1::getName).forEach(System.out::println);



    }
}
