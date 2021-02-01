package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegMenus = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenus * 10.35;
        double fishMenuPrice = fishMenus * 12.40;
        double vegMenuPrice = vegMenus * 8.15;

        double sum = (chickenMenuPrice + fishMenuPrice + vegMenuPrice);
        double desert = sum * 0.2;
        double delivery = 2.50;
        double total = sum + desert + delivery;

        System.out.printf("Total: %.2f", total);
    }
}