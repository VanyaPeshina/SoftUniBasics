package com.soft.uni.fundamentals.conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Ex03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (flowers) {
            case "Roses":
                if (amount > 80) {
                 sum = amount * (5 * 0.9);
                } else {
                    sum = amount * 5;
                } break;

            case "Dahlias":
                if (amount > 90) {
                    sum = amount * (3.80 * 0.85);
                } else {
                    sum = amount * 3.80;
                } break;

            case "Tulips":
                if (amount > 80) {
                    sum = amount * (2.80 * 0.85);
                } else {
                    sum = amount * 2.80;
                } break;

            case "Narcissus":
                if (amount < 120) {
                    sum = amount * (3 * 1.15);
                } else {
                    sum = amount * 3;
                } break;

            case "Gladiolus":
                if (amount < 80) {
                    sum = amount * (2.50 * 1.2);
                } else {
                    sum = amount * 2.50;
                } break;

        } if (budget >= sum) {
            double moneyLeft = budget - sum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", amount, flowers, moneyLeft);
        } else {
            double moneyNeeded = sum - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
        }
    }
}