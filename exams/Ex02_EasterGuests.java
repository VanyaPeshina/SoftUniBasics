package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double easterBreadPrice = 4;
        double eggPrice = 0.45;

        double easterBreadsNeeded = Math.ceil(guests / 3);
        double eggsNeeded = guests * 2;

        double sum = (easterBreadsNeeded * easterBreadPrice) + (eggsNeeded * eggPrice);
        double moneyLeft = budget - sum;
        double moneyNeeded = sum - budget;

        if (sum <= budget) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.\nHe has %.2f lv. left.", easterBreadsNeeded, eggsNeeded, moneyLeft);
        }
        else if ( sum > budget) {
            System.out.printf("Lyubo doesn't have enough money.\nHe needs %.2f lv. more.", moneyNeeded);
        }
    }
}
