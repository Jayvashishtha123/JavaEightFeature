package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem07 {
    static void main(String[] args) {
        ZonedDateTime indiaTime =
                ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        ZonedDateTime usTime =
                indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("India Time: " + indiaTime);
        System.out.println("US Time: " + usTime);
    }
}
