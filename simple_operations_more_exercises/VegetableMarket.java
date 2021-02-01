package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPricePerKg = Double.parseDouble(scanner.nextLine());
        double fruitsPricePerKg = Double.parseDouble(scanner.nextLine());
        int vegKg = Integer.parseInt(scanner.nextLine());
        int fruitsKg = Integer.parseInt(scanner.nextLine());

        double income = (vegKg * vegPricePerKg) + (fruitsKg * fruitsPricePerKg);

        double incomeInEuro = income / 1.94;

        System.out.printf("%.2f", incomeInEuro);
    }
}
