package com.soft.uni.fundamentals.for_loop_exercise;

import java.util.Scanner;

public class Ex02_HalfSumElement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int max = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                int a = Integer.parseInt(scanner.nextLine());
                sum += a;
                if (a > max) {
                    max = a;
                }
            } int sumWithoutMax = sum - max;
            if (max == sumWithoutMax) {
                System.out.println("Yes\nSum = " + max);
            } else {
                int diff = Math.abs(max - sumWithoutMax);
                System.out.println("No\nDiff = " + diff);
            }
        }
}
