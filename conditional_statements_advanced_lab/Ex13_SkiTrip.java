package com.soft.uni.fundamentals.conditional_statements_advanced_lab;

import java.util.Scanner;

public class Ex13_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double price = 0;
        int nights = days - 1;

        switch (room) {
            case "room for one person":
                price = nights * 18;
                break;

            case "apartment":
                if (days < 10) {
                price = nights * (25 * 0.7);
                } else if (days >= 10 && days <= 15) {
                    price = nights * (25 * 0.65);
                } else if (days > 15){
                    price = nights * (25 * 0.5);
                } break;

            case "president apartment":
                if (days < 10) {
                price = nights * (35 * 0.9);
                } else if (days >= 10 && days <= 15) {
                    price = nights * (35 * 0.85);
                } else if (days > 15){
                    price = nights * (35 * 0.8);
                } break;
            }

            if (evaluation.equals("positive")) {
                double total = price + (price * 0.25);
                System.out.printf("%.2f", total);

            } else if (evaluation.equals("negative")) {
                double total = price - (price * .1);
                System.out.printf("%.2f", total);
            }
    }
}