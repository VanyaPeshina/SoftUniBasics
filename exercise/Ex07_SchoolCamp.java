package com.soft.uni.fundamentals.exercise;

import java.util.Scanner;

public class Ex07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (group.equals("boys")) {
                    price = 9.60 * nights;
                    sport = "Judo";
                } else if (group.equals("girls")) {
                    price = 9.60 * nights;
                    sport = "Gymnastics";
                } else if (group.equals("mixed")) {
                    price = 10 * nights;
                    sport = "Ski";
                } break;

            case "Spring":
                if (group.equals("boys")) {
                    price = 7.20 * nights;
                    sport = "Tennis";
                } else if (group.equals("girls")) {
                    price = 7.20 * nights;
                    sport = "Athletics";
                } else if (group.equals("mixed")) {
                    price = 9.50 * nights;
                    sport = "Cycling";
                } break;

            case "Summer":
                if (group.equals("boys")) {
                    price = 15 * nights;
                    sport = "Football";
                } else if (group.equals("girls")) {
                    price = 15 * nights;
                    sport = "Volleyball";
                } else if (group.equals("mixed")) {
                    price = 20 * nights;
                    sport = "Swimming";
                } break;
        }
        if (students >= 50) {
            price *= 0.5;
        } else if (students >= 20) {
            price *= 0.85;
        } else if (students >= 10) {
            price *= 0.95;
        }
        double total = price * students;
        System.out.printf("%s %.2f lv.", sport,total);
    }
}