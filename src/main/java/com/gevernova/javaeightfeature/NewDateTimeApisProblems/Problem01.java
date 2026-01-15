package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Start date (YYYY-MM-DD) :-");
        LocalDate startDate = LocalDate.parse(sc.next());

        System.out.println("Enter the Start date (YYYY-MM-DD) :-");
        LocalDate endDate = LocalDate.parse(sc.next());

        Period period = Period.between(startDate,endDate);

        System.out.println("\n📅 Period Between Dates:");
        System.out.println("Years  : " + period.getYears());
        System.out.println("Months : " + period.getMonths());
        System.out.println("Days   : " + period.getDays());

        System.out.println("\n➡️  Total Duration: "
                + period.getYears() + " years, "
                + period.getMonths() + " months, "
                + period.getDays() + " days");

    }
}
