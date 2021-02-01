package com.soft.uni.fundamentals.for_loop_lab;

import java.util.Scanner;

public class Ex10_OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {
                sumOdd += a;
            } else {
                sumEven += a;
            }
        }
        if (sumEven == sumOdd) {
            System.out.println("Yes\nSum = " +sumEven);
        } else {
            System.out.println("No\nDiff = " + Math.abs(sumEven - sumOdd));
        }
    }
}