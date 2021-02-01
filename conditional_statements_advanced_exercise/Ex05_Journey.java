package com.soft.uni.fundamentals.conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Ex05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double sum = 0;
        String type = "";

        switch (season) {
            case "summer":
                type = "Camp";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    sum = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    sum = budget * 0.4;
                } else {
                    type = "Hotel";
                    destination = "Europe";
                    sum = budget * 0.9;
                }break;

            case "winter":
                type = "Hotel";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    sum = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    sum = budget * 0.8;
                } else {
                    destination = "Europe";
                    sum = budget * 0.9;
                }break;
        }
        System.out.printf("Somewhere in %s\n%s - %.2f", destination, type, sum);
    }
}