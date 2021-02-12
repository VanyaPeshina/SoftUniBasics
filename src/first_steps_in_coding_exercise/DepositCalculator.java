package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double AIR = Double.parseDouble(scanner.nextLine());

        double interest = deposit * AIR / 100;
        double interestPerMonth = interest / 12;

        double sum = deposit + term * interestPerMonth;
        System.out.println(sum);

    }
}
