package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Problem04 {
    static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate firstDay = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println("Today        : " + today);
        System.out.println("First Day    : " + firstDay);
        System.out.println("Last Day     : " + lastDay);
    }
}
