package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPricePerKg = Double.parseDouble(scanner.nextLine());
        double spratPricePerKg = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double horseMackKg = Double.parseDouble(scanner.nextLine());
        double musselsKg = Double.parseDouble(scanner.nextLine());

        double bonitoPricePerKg = mackerelPricePerKg + (mackerelPricePerKg * 0.6);
        double horseMackPricePerKg = spratPricePerKg + (spratPricePerKg * 0.8);

        double bonitoPrice = bonitoKg * bonitoPricePerKg;
        double horseMackPrice = horseMackKg * horseMackPricePerKg;
        double musselsPrice = musselsKg * 7.5;

        double sum = bonitoPrice + horseMackPrice + musselsPrice;
        System.out.printf("%.2f", sum);
    }
}
