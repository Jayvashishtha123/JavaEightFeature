package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Problem02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Define new format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // Format and print
        String formattedDate = date.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
