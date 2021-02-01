package com.soft.uni.fundamentals.for_loop_exercise;

import java.util.Scanner;

public class Ex03_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double evenSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double evenMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;


        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax){
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }
        } if (oddSum == 0 && evenSum != 0) {
            System.out.printf("OddSum=%.2f,\nOddMin=No,\nOddMax=No,",oddSum);
            System.out.printf("EvenSum=%.2f,\nEvenMin=%.2f,\nEvenMax=%.2f",evenSum,evenMin,evenMax);
        } else if (evenSum == 0 && oddSum != 0) {
            System.out.printf("OddSum=%.2f,\nOddMin=%.2f,\nOddMax=%.2f,\n",oddSum,oddMin,oddMax);
            System.out.printf("EvenSum=%.2f,\nEvenMin=No,\nEvenMax=No",evenSum);

        } else if (evenSum != 0 && oddSum != 0) {
            System.out.printf("OddSum=%.2f,%n", oddSum);
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
            System.out.printf("EvenSum=%.2f,%n", evenSum);
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f", evenMax);
        } else if (n == 0) {
            System.out.println("OddSum=0.00,\nOddMin=No,\nOddMax=No,");
            System.out.print("EvenSum=0.00,\nEvenMin=No,\nEvenMax=No");
        }
    }
}
