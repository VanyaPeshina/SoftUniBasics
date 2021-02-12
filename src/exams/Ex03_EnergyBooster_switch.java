package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_EnergyBooster_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon" -> price = 56 * 2;
                case "Mango" -> price = 36.66 * 2;
                case "Pineapple" -> price = 42.10 * 2;
                case "Raspberry"-> price = 20 * 2;
            }
        } else if (size.equals("big")) {
            switch (fruit) {
                case "Watermelon" -> price = 28.70 * 5;
                case "Mango" -> price = 19.60 * 5;
                case "Pineapple" -> price = 24.80 * 5;
                case "Raspberry" -> price = 15.20 * 5;
            }
        } double sum = price * amount;

        if (sum >= 400 && sum <= 1000) {
            sum = price * amount * 0.85;
        } else if (sum > 1000) {
            sum = price * amount * 0.5;
        }
        System.out.printf("%.2f lv.", sum);
    }
}