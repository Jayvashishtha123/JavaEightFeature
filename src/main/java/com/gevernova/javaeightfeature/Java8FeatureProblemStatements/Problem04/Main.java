package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem04;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {

        List<Claim> list = List.of(new Claim(1,2345,"16-01-2026","Pass",2000),
                new Claim(2,7890,"14-01-2026","Fail",3000),
        new Claim(3,5432,"13-01-2026","Ongoin",4000),
                new Claim(4,7356,"12-01-2026","Pending",5000),
                new Claim(5,9754,"11-01-2026","Pass",6000),
                new Claim(6,1423,"10-01-2026","Fail",7000),
        new Claim(2,7890,"14-01-2026","Fail",3000),
                new Claim(3,5432,"13-01-2026","Ongoin",4000),
                new Claim(4,7356,"12-01-2026","Pending",5000),
                new Claim(5,9754,"11-01-2026","Pass",6000),
                new Claim(6,1423,"10-01-2026","Fail",7000)

                );

        //Filter:-
        List<Claim> filteredList = list.stream().filter((s)->s.claimAmount>5000 && s.status=="Pass").collect(Collectors.toList());
        System.out.println(filteredList);

        //Group:-
        Map<Integer ,List<Claim>> GroupById = list.stream().collect(Collectors.groupingBy(Claim::getPolicyNumber));
        System.out.println(GroupById);

        //Aggregate:-
        Map<Integer, DoubleSummaryStatistics> policyStats =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Claim::getPolicyNumber,
                                Collectors.summarizingDouble(Claim::getClaimAmount)
                        ));
        System.out.println(policyStats);

        //Top N;
        //lets take, n=3
        List<Map.Entry<Integer, Double>> top3Policies =
                policyStats.entrySet().stream()
                        .map(e -> Map.entry(e.getKey(), e.getValue().getSum()))
                        .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed())
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(top3Policies);

    }
}
