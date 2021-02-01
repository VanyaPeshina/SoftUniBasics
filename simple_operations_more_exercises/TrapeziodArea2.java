package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class TrapeziodArea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double S = (a + b) * h / 2;
        System.out.println(S);
    }
}
