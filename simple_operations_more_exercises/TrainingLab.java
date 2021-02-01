package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double roomLength = Double.parseDouble(scanner.nextLine());
        double roomWidth = Double.parseDouble(scanner.nextLine());

        double roomSqCm = (roomLength * roomWidth) * 100;
        double roomWithoutPassageway = roomSqCm - roomLength;
        double workingSpaceSqCm = 70 * 120;
        double workingSpaces = (roomWithoutPassageway / workingSpaceSqCm) - 3;

        System.out.println(workingSpaces);
        //не е решение
    }

}

