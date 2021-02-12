package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double sunBedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalTax = people * tax;
        double umbrellasNeeded = Math.ceil(people / 2);
        double umbrellaTax = umbrellasNeeded * umbrellaPrice;
        double sunBedsNeeded = Math.ceil(people * 0.75);
        double sunBedsTax = sunBedsNeeded * sunBedPrice;

        double sum = totalTax + umbrellaTax + sunBedsTax;
        System.out.printf("%.2f lv.", sum);
    }
}