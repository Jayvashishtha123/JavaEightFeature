package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem01;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1,"Jay","Engineering",20000),
                new Employee(2,"Rashi","IT",30000),
                new Employee(3,"Pooja","Medical",50000),
                new Employee(4,"Kavita","Agriculture",70000),
                new Employee(5,"Ravi","IT",80000),
                new Employee(6,"Taj","Engineering",90000)
                );

        //1:- Filter:- Select Employee who belong to the "Engineering" department  and have a salary greater then $80,000.
        list.stream().filter((s)-> Objects.equals(s.department, "Engineering")).filter((s)->s.salary>80000).forEach(System.out::println);

        //2:- Sort:- Sort these Employees by their salary in descending order.
        List<Employee> sortedEmployees = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(sortedEmployees);

        //3:- Group:- Group the resulting employees by their department.
        Map<String,List<Employee>> list1 = list.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(list1);

        //4:- Aggregate:- For each department, Calculate the average salary of employee.
        Map<String, Double> averageSalaryByDepartment =
                list1.entrySet()
                        .stream()
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                entry -> entry.getValue()
                                        .stream()
                                        .mapToDouble(Employee::getSalary)
                                        .average()
                                        .orElse(0.0)
                        ));
        System.out.println(averageSalaryByDepartment);

    }
}
