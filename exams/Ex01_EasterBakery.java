package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double floorPriceKg = Double.parseDouble(scanner.nextLine());
        double floorKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggsPackage = Integer.parseInt(scanner.nextLine());
        int yeastPackage = Integer.parseInt(scanner.nextLine());

        double floorPrice = floorKg * floorPriceKg;

        double sugar1 = floorPriceKg - (floorPriceKg * 0.25);
        double sugarPrice = sugarKg * sugar1;

        double eggs1P = floorPriceKg * 1.1;
        double eggsPrice = eggsPackage * eggs1P;

        double yeast1 = sugar1 - (sugar1 * 0.8);
        double yeastPrice = yeastPackage * yeast1;

        double sum = floorPrice + sugarPrice + eggsPrice + yeastPrice;
        System.out.printf("%.2f", sum);
    }
}