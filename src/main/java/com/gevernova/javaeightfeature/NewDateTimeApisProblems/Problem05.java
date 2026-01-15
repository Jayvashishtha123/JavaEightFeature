package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Problem05 {
    static void main(String[] args) {
        String input = "15-Jan-2022 14:30:00";

        DateTimeFormatter inputFormatter =
                DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter);

        DateTimeFormatter outputFormatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Formatted Date: " + dateTime.format(outputFormatter));
    }
}
