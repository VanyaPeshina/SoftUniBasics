package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double allClothesPrice = statists * clothesPrice;
        double sum = decorPrice + allClothesPrice;

        if (statists >= 150) {
            double allClPriceWithDiscount = allClothesPrice * 0.9;
            sum = decorPrice + allClPriceWithDiscount;
        }
        double moneyMissing = sum - budget;
        double moneyLeft = budget - sum;

        if (sum > budget) {
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", moneyMissing);
        } else if (sum <= budget) {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}