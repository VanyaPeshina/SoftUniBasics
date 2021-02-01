package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine().toLowerCase();

        double fuelPricePerL = 2.10;
        double guideTax = 100;
        double fuelCost = fuel * fuelPricePerL;
        double total = fuelCost + guideTax;

        if (day.equals("saturday")) {
            total = total - (total * 0.10);
        }
        else if (day.equals("sunday")) {
            total = total - (total * 0.20);
        }

        double moneyLeft = budget - total;
        double moneyNeeded = total - budget;

        if (total <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", moneyLeft);
        }
        else if (total > budget) {
            System.out.printf("Not enough money! Money needed: %.2f lv.", moneyNeeded);
        }
    }
}
