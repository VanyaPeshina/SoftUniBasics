package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double triangleSide = scanner.nextDouble();
        double triаngleHeight = scanner.nextDouble();

        double triangleArea = (triangleSide * triаngleHeight) / 2;
        System.out.printf("%.2f", triangleArea);
    }
}
