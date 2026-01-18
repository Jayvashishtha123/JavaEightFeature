package com.gevernova.javaeightfeature.Java8FeatureProblemStatements.Product03;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Book> list = List.of(new Book("Mathematics Fundamentals","PK Jain","Science Fiction",8),
                new Book("Biology Fundamentals","RK Jha","Biology Fiction",5),
                new Book("Chemistry Fundamentals","SK Singh","Chemical Fiction",4),
                new Book("English Fundamentals","RV Sarojini","English Communication",7),
                new Book("Geography Fundamentals","Purav Jha","Geological Fiction",9),
        new Book("Biology Fundamentals","RK Jha","Biology Fiction",5),
                new Book("Chemistry Fundamentals","SK Singh","Chemical Fiction",4),
                new Book("English Fundamentals","RV Sarojini","English Communication",7),
                new Book("Geography Fundamentals","Purav Jha","Geological Fiction",9)

        );

        //Filter:-
        List<Book> list1 = list.stream().filter((s)-> Objects.equals(s.genre, "Science Fiction") && s.rating>4).collect(Collectors.toList());
        System.out.println(list1);

        //Tranform:-
        List<BookRecommendation> recommendations = list.stream()
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .collect(Collectors.toList());
        System.out.println(recommendations);

        //sort:-
        List<BookRecommendation> sortedBook =
                recommendations.stream().sorted(Comparator.comparing(BookRecommendation::getRating).reversed()).collect(Collectors.toList());
        System.out.println(sortedBook);

        //Paginate:-
        int pageSize = 5;

        int pageNumber = 1;

        List<BookRecommendation> page1 = sortedBook.stream()
                .skip((pageNumber - 1) * pageSize) // skip 0
                .limit(pageSize)                   // take 5
                .collect(Collectors.toList());

         pageNumber = 2;

        List<BookRecommendation> page2 = sortedBook.stream()
                .skip((pageNumber - 1) * pageSize) // skip 5
                .limit(pageSize)                   // take next 5
                .collect(Collectors.toList());

        System.out.println("Page 1:");
        page1.forEach(System.out::println);

        System.out.println("\nPage 2:");
        page2.forEach(System.out::println);





    }
}
