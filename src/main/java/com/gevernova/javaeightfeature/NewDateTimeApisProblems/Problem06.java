package com.gevernova.javaeightfeature.NewDateTimeApisProblems;

import java.time.Duration;
import java.time.Instant;

public class Problem06 {
    static void main(String[] args) {
        Instant start = Instant.now();

        // Sample task
        for (int i = 0; i < 10000000; i++) {
            Math.sqrt(i);
        }

        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println("Execution time (seconds): " + duration.getSeconds());
    }
}
