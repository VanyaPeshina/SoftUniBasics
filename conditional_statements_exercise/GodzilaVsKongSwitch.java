package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class GodzilaVsKongSwitch {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double budget = Double.parseDouble(scanner.nextLine());
            int statists = Integer.parseInt(scanner.nextLine());
            double clothesPrice = Double.parseDouble(scanner.nextLine());

            double decorPrice = budget * 0.10;
            double allClothesPrice = statists * clothesPrice;

            if (statists >= 150) {
                allClothesPrice = allClothesPrice - (allClothesPrice * 0.10);
                double sum = decorPrice + allClothesPrice;
            }
            double sum = decorPrice + allClothesPrice;

            if (sum > budget) {
                double moneyMissing = sum - budget;
                System.out.printf("Not enough money! \nWingard needs %.2f leva more.", moneyMissing);
            }
            else {
                double moneyLeft = budget - sum;
                System.out.printf("Action! \nWingard starts filming with %.2f leva left.", moneyLeft);
            }
        }
}