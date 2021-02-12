package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class Ex02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - daysOff;
        int workDaysPlay = workDays * 63;
        int daysOffPlay = daysOff * 127;
        int annuallyPlay = workDaysPlay + daysOffPlay;

        int norm = 30_000;
        double difference = Math.abs(30_000 - annuallyPlay);
        double hours = Math.floor(difference / 60);
        double minutes = difference % 60;

        if (annuallyPlay > norm) {
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", hours, minutes);
        }
        else {
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", hours, minutes);
        }
    }
}