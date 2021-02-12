package com.soft.uni.fundamentals.for_loop_more_exercises;

import java.util.Scanner;

public class Ex06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        int water = 20;
        int internet = 15;
        double electricityBill = 0;

        for (int i = 1; i <= months ; i++) {
            double elBill = Double.parseDouble(scanner.nextLine());
            electricityBill += elBill;
        }
        double other = (electricityBill + (months * water) + (months * internet)) * 1.2;
        double waterBillMonths = water * months;
        double intBillMonths = internet * months;
        double averageExpense = (waterBillMonths + intBillMonths + electricityBill + other) / months;

        System.out.printf("Electricity: %.2f lv\n", electricityBill);
        System.out.printf("Water: %.2f lv\n", waterBillMonths);
        System.out.printf("Internet: %.2f lv\n", intBillMonths);
        System.out.printf("Other: %.2f lv\n", other);
        System.out.printf("Average: %.2f lv", averageExpense);
    }
}