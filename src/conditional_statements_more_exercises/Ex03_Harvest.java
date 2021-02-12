package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class Ex03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineYard2m = Integer.parseInt(scanner.nextLine());
        double grape2m = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double grapeAmount = vineYard2m * grape2m;
        double grapeForWine = grapeAmount * 0.4;
        double wine = grapeForWine / 2.5;

        double wineX = Math.abs(wineNeeded - wine);
        double winePerPerson = wineX / workers;

        if (wine < wineNeeded) {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineX));
        }
        else if (wine >= wineNeeded){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", Math.floor(wine));
            System.out.println();
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(wineX), Math.ceil(winePerPerson));
        }
    }
}