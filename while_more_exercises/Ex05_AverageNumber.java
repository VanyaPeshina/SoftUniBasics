package com.soft.uni.fundamentals.while_more_exercises;

import java.util.Scanner;

public class Ex05_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        double averageNumber = sum / n;
        System.out.printf("%.2f", averageNumber);
    }
}