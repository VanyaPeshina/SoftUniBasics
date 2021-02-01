package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double allClothesPrice = statists * clothesPrice;
        double allClWithDiscount = allClothesPrice - (allClothesPrice * 0.10);
        double sumDiscounted = decorPrice + allClWithDiscount;
        double sumNoDiscount = decorPrice + allClothesPrice;


        if (statists >= 150 && sumDiscounted < budget) {
            double moneyLeft = budget - sumDiscounted;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
        else if (statists >= 150 && sumDiscounted > budget) {
            double moneyMissing = Math.abs(sumDiscounted - budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyMissing);
        }
        else if (statists < 150 && sumNoDiscount < budget) {
            double moneyLeft2 = budget - sumNoDiscount;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft2);
        }
        else if (statists < 150 && sumNoDiscount > budget) {
            double moneyMissing2 = Math.abs(sumNoDiscount - budget);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyMissing2);
        }
    }
}
