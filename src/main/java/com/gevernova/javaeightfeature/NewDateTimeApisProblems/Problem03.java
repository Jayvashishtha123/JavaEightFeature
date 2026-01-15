package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem03 {
    static void main(String[] args) {
        // Current time in UTC
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));

        // Current time in system default time zone
        ZonedDateTime localTime = ZonedDateTime.now(ZoneId.systemDefault());

        // Calculate difference
        Duration difference = Duration.between(utcTime, localTime);

        long hours = difference.toHours();
        long minutes = difference.toMinutes() % 60;

        System.out.println("UTC Time   : " + utcTime.toLocalTime());
        System.out.println("Local Time : " + localTime.toLocalTime());

        System.out.println("\nTime Difference:");
        System.out.println(Math.abs(hours) + " hours and " + Math.abs(minutes) + " minutes");

    }
}
