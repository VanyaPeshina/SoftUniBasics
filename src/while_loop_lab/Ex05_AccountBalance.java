package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contribution = scanner.nextLine();

        double sum = 0;

        while (!contribution.equals("NoMoreMoney")) {
            double n = Double.parseDouble(contribution);
            if (Double.parseDouble(contribution) < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            sum += n;
            System.out.printf("Increase: %.2f\n", n);
            contribution = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}