package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = Math.PI * (r * r);
        double calculatedPerimeter =  Math.PI * (2 * r);

        System.out.printf("%.2f \n", calculatedArea);
        System.out.printf("%.2f", calculatedPerimeter);
    }
}
