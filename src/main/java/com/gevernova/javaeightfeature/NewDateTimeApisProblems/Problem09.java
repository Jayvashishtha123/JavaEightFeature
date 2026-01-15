package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Problem09 {
    static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime now = ZonedDateTime.now(zone);

        boolean isDST = zone.getRules().isDaylightSavings(now.toInstant());

        System.out.println("Time Zone: " + zone);
        System.out.println("Is Daylight Saving active? " + isDST);
    }
}
