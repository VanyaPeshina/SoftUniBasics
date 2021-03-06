package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmAmount = Integer.parseInt(scanner.nextLine());

        double ratingMax = Double.NEGATIVE_INFINITY;
        double ratingMin = Double.POSITIVE_INFINITY;
        String filmMax = "";
        String filmMin = "";
        double ratingSum = 0;

        for (int i = 1; i <= filmAmount; i++) {
            String movie = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            ratingSum += rating;

            if (rating > ratingMax) {
                filmMax = movie;
                ratingMax = rating;
            }
            if (rating < ratingMin) {
                filmMin = movie;
                ratingMin = rating;
            }
        }
        double ratingAverage = ratingSum / filmAmount;
        System.out.printf("%s is with highest rating: %.1f\n", filmMax, ratingMax);
        System.out.printf("%s is with lowest rating: %.1f\n", filmMin, ratingMin);
        System.out.printf("Average rating: %.1f", ratingAverage);
    }
}