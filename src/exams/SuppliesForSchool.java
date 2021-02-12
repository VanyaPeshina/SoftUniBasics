package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPacks = Integer.parseInt(scanner.nextLine());
        int markerPacks = Integer.parseInt(scanner.nextLine());
        double cleaningDetergentL = Double.parseDouble(scanner.nextLine());
        int discount =  Integer.parseInt(scanner.nextLine());

        double pensCost = penPacks * 5.80;
        double markersCost = markerPacks * 7.20;
        double detergentCost = cleaningDetergentL * 1.2;

        double sum = pensCost + markersCost + detergentCost;
        double sumWithDiscount = sum - ((sum * discount) / 100);
        System.out.printf("%.3f", sumWithDiscount);
    }
}
