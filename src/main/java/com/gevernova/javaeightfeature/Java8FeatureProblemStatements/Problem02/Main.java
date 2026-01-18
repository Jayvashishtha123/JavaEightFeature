package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Problem02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Sale> list = List.of(new Sale(1,20,20000),
                new Sale(2,30,30000),
                new Sale(3,40,50000),
                new Sale(4,50,70000),
                new Sale(5,60,90000)
                );

        //Filter
        list.stream().filter((s)->s.quantity>10).forEach(System.out::println);

        //Transform
        List<ProductSales> productSalesList =
                list.stream()
                        .map(sale ->
                                new ProductSales(
                                        sale.getProductId(),
                                        sale.getQuantity() * sale.getPrice()
                                )
                        )
                        .collect(Collectors.toList());
        System.out.println(productSalesList);

        //Sort:-
        List<ProductSales> sortedList = productSalesList.stream().sorted(Comparator.comparing(ProductSales::getTotalRevenue).reversed()).collect(Collectors.toList());
        System.out.println(sortedList);


        //Top N:-
        List<ProductSales> top5Product = sortedList.stream().limit(5).collect(Collectors.toList());
        System.out.println(top5Product);

    }
}
