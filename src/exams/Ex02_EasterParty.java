package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double cake = budget * 0.10;
        double price = pricePerGuest * guests;

        if (guests >= 10 && guests <= 15) {
            double price15 = price - (price * 0.15);
            double sum = price15 + cake;
            double moneyLeft = budget - sum;
            double moneyNeeded = sum - budget;
            if (sum <= budget) {
                System.out.printf("It is party time! %.2f leva left.", moneyLeft);
            }else if (sum > budget) {
                System.out.printf("No party! %.2f leva needed.", moneyNeeded);
            }
        }
        else if (guests > 15 && guests <= 20) {
            double price20 = price - (price * 0.2);
            double sum = price20 + cake;
            double moneyLeft = budget - sum;
            double moneyNeeded = sum - budget;
            if (sum <= budget) {
                System.out.printf("It is party time! %.2f leva left.", moneyLeft);
            }else if (sum > budget) {
                System.out.printf("No party! %.2f leva needed.", moneyNeeded);
            }
        }
        else if (guests > 20) {
            double price25 = price - (price * 0.25);
            double sum = price25 + cake;
            double moneyLeft = budget - sum;
            double moneyNeeded = sum - budget;
            if (sum <= budget) {
                System.out.printf("It is party time! %.2f leva left.", moneyLeft);
            }
            else if (sum > budget) {
                System.out.printf("No party! %.2f leva needed.", moneyNeeded);
            }
        }
        else {
            double sum = price + cake;
            double moneyLeft = budget - sum;
            double moneyNeeded = sum - budget;
            if (sum <= budget) {
                System.out.printf("It is party time! %.2f leva left.", moneyLeft);
            }
            else if (sum > budget) {
                System.out.printf("No party! %.2f leva needed.", moneyNeeded);
            }
        }
    }
}