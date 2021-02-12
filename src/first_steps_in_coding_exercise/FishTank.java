package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthCm = Integer.parseInt(scanner.nextLine());
        int widthCm = Integer.parseInt(scanner.nextLine());
        int heightCm = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = lengthCm * widthCm * heightCm;
        double water = volume * 0.001;
        double percentPlastic = percent * 0.01;
        double litres = water - (water * percentPlastic);

        System.out.printf("%.2f", litres);

    }
}
