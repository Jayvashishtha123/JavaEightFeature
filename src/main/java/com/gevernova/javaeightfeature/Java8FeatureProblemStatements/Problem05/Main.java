package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem05;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<PolicyHolder> list =
                List.of(new PolicyHolder("1234","Jay","81","Life",2345),
                        new PolicyHolder("2234","Sani","71","Work",1245),
                        new PolicyHolder("3234","Mudit","60","Travel",6543),
                        new PolicyHolder("5234","Purvi","19","Life",9856),
                        new PolicyHolder("7234","Neha","19","Work",1235),
                        new PolicyHolder("8234","Ruchika","18","Life",6576),
                        new PolicyHolder("9234","Dhruv","71","Travel",4545),
                        new PolicyHolder("0234","Nancy","93","Life",2341)

                        );

        //Filter:-
        List<PolicyHolder> filteredHolders =
                list.stream()
                        .filter(p -> "Life".equals(p.getPolicyType()))
                        .filter(p -> Integer.parseInt(p.getAge()) > 60)
                        .collect(Collectors.toList());
        System.out.println(filteredHolders);

        //Transform
        List<RiskAssessment> riskAssessments =
                filteredHolders.stream()
                        .map(p -> {
                            int age = Integer.parseInt(p.getAge());
                            double riskScore = (double) p.getPremiumAmount() / age;

                            return new RiskAssessment(
                                    p.getHolderId(),
                                    p.getName(),
                                    riskScore
                            );
                        })
                        .collect(Collectors.toList());

        System.out.println(riskAssessments);

        //Sort
        List<RiskAssessment> sortedRisks =
                riskAssessments.stream()
                        .sorted(Comparator.comparing(RiskAssessment::getRiskScore).reversed())
                        .collect(Collectors.toList());
        System.out.println(sortedRisks);


        //Categorize....
        Map<String, List<RiskAssessment>> categorizedRisks =
                sortedRisks.stream()
                        .collect(Collectors.groupingBy(
                                r -> r.getRiskScore() > 0.5 ? "High Risk" : "Low Risk"
                        ));

        System.out.println(categorizedRisks);

    }
}
