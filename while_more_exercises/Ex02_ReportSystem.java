package com.soft.uni.fundamentals.while_more_exercises;

import java.util.Scanner;

public class Ex02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int currentMoney = 0;
        int counter = 0;
        int cashPayment = 0;
        int cashCounter = 0;
        int cardPayment = 0;
        int cardCounter = 0;

        while (!input.equals("End")) {
            counter++;
            if (counter % 2 == 0) {
                if (Integer.parseInt(input) < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardPayment += Integer.parseInt(input);
                    currentMoney += Integer.parseInt(input);
                    cardCounter++;
                }
            } else {
                if (Integer.parseInt(input) > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cashPayment += Integer.parseInt(input);
                    currentMoney += Integer.parseInt(input);
                    cashCounter++;
                }
            }
            if (currentMoney >= sum) {
                break;
            }
            input = scanner.nextLine();
        }
        double averageCashPayment = 1.0 * cashPayment / cashCounter;
        double averageCardPayment = 1.0 * cardPayment / cardCounter;

        if (currentMoney >= sum) {
            System.out.printf("Average CS: %.2f%nAverage CC: %.2f", averageCashPayment, averageCardPayment);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}