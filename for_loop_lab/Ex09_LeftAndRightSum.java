package com.soft.uni.fundamentals.for_loop_lab;

import java.util.Scanner;

public class Ex09_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < n; i++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
    }
}