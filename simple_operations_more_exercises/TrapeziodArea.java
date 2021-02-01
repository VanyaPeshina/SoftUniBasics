package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double figureS = (b1 + b2) / 2 * h;
        System.out.printf("%.2f", figureS);

    }
}
