package com.soft.uni.fundamentals.conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Ex04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double rentBoat = 0;

        switch (season) {
            case "Spring":
                rentBoat = 3000;
                break;

            case "Summer":
            case "Autumn":
                rentBoat = 4200;
                break;

            case "Winter":
                rentBoat = 2600;
                break;
        }
        if (fishermen <= 6) {
            rentBoat *= 0.90;
        } else if (fishermen <= 11) {
            rentBoat *= 0.85;
        } else {
            rentBoat *= 0.75;
        }

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            rentBoat *= 0.95;
        }

        if (budget >= rentBoat) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rentBoat);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rentBoat - budget);
        }
    }
}