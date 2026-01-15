package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Problem10 {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2005, 10, 31); // change DOB if needed

        LocalDate nextBirthday =
                birthday.withYear(today.getYear());

        if (nextBirthday.isBefore(today) || nextBirthday.isEqual(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        long daysLeft = ChronoUnit.DAYS.between(today, nextBirthday);

        System.out.println("Days remaining until next birthday: " + daysLeft);
    }
}
