package com.soft.uni.fundamentals.for_loop_more_exercises;

import java.util.Scanner;

public class Ex03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pack = Integer.parseInt(scanner.nextLine());
        double weightSum = 0;
        double weightPrice = 0;
        double weightBus = 0;
        double weightTruck = 0;
        double weightTrain = 0;

        for (int i = 1; i <= pack; i++) {
            double weight = Double.parseDouble(scanner.nextLine());
            weightSum += weight;
            if (weight <= 3) {
                weightBus += weight;
                weightPrice += (200 * weight);
            } else if (weight >= 4 && weight <= 11) {
                weightTruck += weight;
                weightPrice += (175 * weight);
            } else if (weight >= 12) {
                weightTrain += weight;
                weightPrice += (120 * weight);
            }
        }
        double averagePrice = weightPrice / weightSum;
        double percentBus = weightBus / weightSum * 100;
        double percentTruck = weightTruck / weightSum * 100;
        double percentTrain = weightTrain / weightSum * 100;

        System.out.printf("%.2f\n",averagePrice);
        System.out.printf("%.2f%%\n",percentBus);
        System.out.printf("%.2f%%\n",percentTruck);
        System.out.printf("%.2f%%",percentTrain);
    }
}