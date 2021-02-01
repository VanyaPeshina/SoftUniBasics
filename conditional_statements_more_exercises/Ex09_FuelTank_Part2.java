package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class Ex09_FuelTank_Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String club = scanner.nextLine();

        double price = 0;
        boolean isValid = club.equals("Yes");

        switch (fuel) {
            case "Gas" -> price = amount * 0.93;
            case "Gasoline" -> price = amount * 2.22;
            case "Diesel" -> price = amount * 2.33;
        }

        if (isValid && fuel.equals("Gas")) {
            price = amount * 0.85;
        } else if (isValid && fuel.equals("Gasoline")) {
            price = amount * 2.04;
        } else if (isValid && fuel.equals("Diesel")) {
            price = amount * 2.21;
        }

        if (amount >= 20 && amount <= 25) {
            double finalPrice = price - (price * 0.08);
            System.out.printf("%.2f lv.", finalPrice);
        } else if (amount > 25) {
            double finalPrice = price - (price * 0.1);
            System.out.printf("%.2f lv.", finalPrice);
        } else {
            System.out.printf("%.2f lv.", price);
        }
    }
}