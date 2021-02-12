package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();

        double deliveryPrice = 60;
        double sum = 0;

        if (amount <= 10) {
            System.out.print("Invalid order");
        } else {
            switch (type) {
                case "90X130":
                    if (amount > 30 && amount <= 60) {
                        sum = 110 * 0.95;
                    } else if (amount > 60) {
                        sum = 110 * 0.92;
                    } else {
                        sum = 110;
                    } break;
                case "100X150":
                    if (amount > 40 && amount <= 80) {
                        sum = 140 * 0.94;
                    } else if (amount > 80) {
                        sum = 140 * 0.90;
                    } else {
                        sum = 140;
                    } break;
                case "130X180":
                    if (amount > 20 && amount <= 50) {
                        sum = 190 * 0.93;
                    } else if (amount > 50) {
                        sum = 190 * 0.88;
                    } else {
                        sum = 190;
                    } break;
                case "200X300":
                    if (amount > 25 && amount <= 50) {
                        sum = 250 * 0.91;
                    } else if (amount > 50) {
                        sum = 250 * 0.86;
                    } else {
                        sum = 250;
                    } break;
            }
        }
        double total = 0;
        if (delivery.equals("With delivery")) {
            total = sum * amount + deliveryPrice;
        } else {
            total = sum * amount;
        }
        if (amount > 99) {
            total *= 0.96;
        }
        if (amount > 10)
            System.out.printf("%.2f BGN", total);
    }
}