package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double percentAddCosts = Double.parseDouble(scanner.nextLine());

        double sumNights = 0;
        double percent = budget * (percentAddCosts / 100);

        if (nights > 7) {
            sumNights = nights * (pricePerNight * 0.95);
        } else if (nights <= 7) {
            sumNights = nights * pricePerNight;
        }
        double total = sumNights + percent;
        double sumPlus = budget - total;
        double sumNeeded = total - budget;

        if (budget >= total) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", sumPlus);
        } else if (budget < total) {
            System.out.printf("%.2f leva needed.", sumNeeded);
        }
    }
}