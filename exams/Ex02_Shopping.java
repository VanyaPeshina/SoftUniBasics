package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int vC = Integer.parseInt(scanner.nextLine());
        int processor = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double vCPrice = vC * 250;
        double processorPrice = vCPrice * 0.35 * processor;
        double ramPrice = vCPrice * 0.1 * ram;
        double total = vCPrice + processorPrice + ramPrice;

        if (vC > processor) {
            total = (vCPrice + processorPrice + ramPrice) * 0.85;
        }
        double moneyLeft = budget - total;
        double moneyNeeded = total - budget;

        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else if (budget < total) {
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }
    }
}