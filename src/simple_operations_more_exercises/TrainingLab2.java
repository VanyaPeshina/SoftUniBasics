package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class TrainingLab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double roomLengthM = Double.parseDouble(scanner.nextLine());
        double roomWidthM = Double.parseDouble(scanner.nextLine());

        double roomWidthCm = (roomWidthM * 100) - 100;  //hallway
        double roomLengthCm = roomLengthM * 100;

        int columns = (int) roomWidthCm / 70;
        int rows = (int) roomLengthCm / 120;
        int workingSpaces = (columns * rows) - 3;

        System.out.println(workingSpaces);



    }
}
