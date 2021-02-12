package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (size.equals("small")) {
            if (fruit.equals("Watermelon")) {
                price = 56 * 2;
            } else if (fruit.equals("Mango")) {
                price = 36.66 * 2;
            } else if (fruit.equals("Pineapple")) {
                price = 42.10 * 2;
            } else if (fruit.equals("Raspberry")) {
                price = 20 * 2;
            }
        } else if (size.equals("big")) {
            if (fruit.equals("Watermelon")) {
                price = 28.70 * 5;
            } else if (fruit.equals("Mango")) {
                price = 19.60 * 5;
            } else if (fruit.equals("Pineapple")) {
                price = 24.80 * 5;
            } else if (fruit.equals("Raspberry")) {
                price = 15.20 * 5;
            }
        }

        double sum = price * amount;

        if (sum >= 400 && sum <= 1000) {
            sum = price * amount * 0.85;
        } else if (sum > 1000) {
            sum = price * amount * 0.5;
        }
        System.out.printf("%.2f lv.", sum);
    }
}