package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());

        double sugarAmount = 0;
        double flourAmount = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= easterBread ; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            sugarAmount += sugar;
            if (sugar > maxSugar) {
                maxSugar = sugar;
            }
            int flour = Integer.parseInt(scanner.nextLine());
            flourAmount += flour;
            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }
        double sugarPackages = sugarAmount / 950;
        double flourPackages = flourAmount / 750;

        System.out.printf("Sugar: %.0f\n",Math.ceil(sugarPackages));
        System.out.printf("Flour: %.0f\n",Math.ceil(flourPackages));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}