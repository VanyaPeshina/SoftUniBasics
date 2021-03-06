package com.soft.uni.fundamentals.exercise;

import java.util.Scanner;

public class Ex06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (km <= 5000) {
                    sum = km * 0.75;
                } else if (km > 5000 && km <= 10_000) {
                    sum = km * 0.95;
                } else if (km > 10_000 && km <= 20_000) {
                    sum = km * 1.45;
                } break;

            case "Summer":
                if (km <= 5000) {
                    sum = km * 0.9;
                } else if (km > 5000 && km <= 10_000) {
                    sum = km * 1.1;
                } else if (km > 10_000 && km <= 20_000) {
                    sum = km * 1.45;
                } break;

            case "Winter":
                if (km <= 5000) {
                    sum = km * 1.05;
                } else if (km > 5000 && km <= 10_000) {
                    sum = km * 1.25;
                } else if (km > 10_000 && km <= 20_000) {
                    sum = km * 1.45;
                } break;
        }
        double total = sum * 4 * 0.9;
        System.out.printf("%.2f", total);
    }
}