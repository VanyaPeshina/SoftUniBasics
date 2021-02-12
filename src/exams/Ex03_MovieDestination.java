package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double dailySum = 0;

        if (destination.equals("Dubai")) {
            if (season.equals("Winter")) {
                dailySum = 45_000 * 0.7;
            } else if (season.equals("Summer")) {
                dailySum = 40_000 * 0.7;
            }
        } else if (destination.equals("Sofia")) {
            if (season.equals("Winter")) {
                dailySum = 17_000 * 1.25;
            } else if (season.equals("Summer")) {
                dailySum = 12_500 * 1.25;
            }
        } else if (destination.equals("London")) {
            if (season.equals("Winter")) {
                dailySum = 24_000;
            } else if (season.equals("Summer")) {
                dailySum = 20_250;
            }
        }

        double finalSum = dailySum * days;
        double sumLeft = Math.abs(finalSum - budget);
        double sumNeeded = Math.abs(budget - finalSum);

        if (budget >= finalSum) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", sumLeft);
        } else if (budget < finalSum) {
            System.out.printf("The director needs %.2f leva more!", sumNeeded);
        }
    }
}