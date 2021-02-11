package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstBound = scanner.nextLine();
        String secondBound = scanner.nextLine();

        char firstPosition = firstBound.charAt(0);
        char firstPosition2 = secondBound.charAt(0);
        char secondPosition = firstBound.charAt(1);
        char secondPosition2 = secondBound.charAt(1);
        char thirdPosition = firstBound.charAt(2);
        char thirdPosition2 = secondBound.charAt(2);
        char fourthPosition = firstBound.charAt(3);
        char fourthPosition2 = secondBound.charAt(3);

        int fP = Character.getNumericValue(firstPosition);
        int sP = Character.getNumericValue(secondPosition);
        int tP = Character.getNumericValue(thirdPosition);
        int frP = Character.getNumericValue(fourthPosition);
        int fP2 = Character.getNumericValue(firstPosition2);
        int sP2 = Character.getNumericValue(secondPosition2);
        int tP2 = Character.getNumericValue(thirdPosition2);
        int frP2 = Character.getNumericValue(fourthPosition2);

        for (int a = fP; a <= fP2; a++) {
            for (int i = sP; i <= sP2; i++) {
                for (int j = tP; j <= tP2; j++) {
                    for (int k = frP; k <= frP2; k++) {
                        if (a % 2 != 0 && i % 2 != 0 && j % 2 != 0 && k % 2 != 0) {
                            System.out.printf("%d%d%d%d ",a,i,j,k);
                        }
                    }
                }
            }
        }
    }
}