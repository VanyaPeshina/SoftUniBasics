package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class CelsiusToFarenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degreeCel = Double.parseDouble(scanner.nextLine());

        double degreeFar = (degreeCel * 1.8) + 32;
        System.out.printf("%.2f", degreeFar);
    }
}
