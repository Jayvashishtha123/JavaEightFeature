package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem06;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Transaction> list = List.of(
                new Transaction(10000,324,1,"16-01-2026",false),
                new Transaction(20000,124,2,"15-01-2026",true),
                new Transaction(30000,224,3,"14-01-2026",false),
                new Transaction(40000,424,4,"13-01-2026",true),
                new Transaction(50000,524,9,"12-01-2026",true),
                new Transaction(80000,724,6,"19-01-2026",false)

        );

        //Filter
        list.stream().filter((s)->s.isFraudulent && s.amount>10000).forEach(System.out::println);

        //Group
        Map<Integer,List<Transaction>> grouped=list.stream().collect(Collectors.groupingBy(Transaction::getPolicyNumber));
        System.out.println(grouped);

        //Aggregate



        //Alter



    }
}
