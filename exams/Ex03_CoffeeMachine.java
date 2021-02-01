package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (drink) {
            case "Espresso":
                if (sugar.equals("Without")) {
                    sum = 0.9 * amount;
                } else if (sugar.equals("Normal")) {
                    sum = amount;
                } else if (sugar.equals("Extra")) {
                    sum = 1.20 * amount;
                } break;

            case "Cappuccino":
            if (sugar.equals("Without")) {
                sum = amount;
            } else if (sugar.equals("Normal")) {
                sum = 1.2 * amount;
            } else if (sugar.equals("Extra")) {
                sum = 1.60 * amount;
            } break;

            case "Tea":
            if (sugar.equals("Without")) {
                sum = 0.5 * amount;
            } else if (sugar.equals("Normal")) {
                sum = 0.6 * amount;
            } else if (sugar.equals("Extra")) {
                sum = 0.70 * amount;
            } break;
        }
        if (sugar.equals("Without")) {
            sum *= 0.65;
        }
        if (drink.equals("Espresso") && amount >= 5) {
            sum *= 0.75;
        }
        if (sum > 15) {
            sum *= 0.8;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", amount, drink, sum);
    }
}