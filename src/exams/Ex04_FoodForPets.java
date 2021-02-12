package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double dogFood = 0;
        double catFood = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            int foodDogPerDay = Integer.parseInt(scanner.nextLine());
            dogFood += foodDogPerDay;
            int foodCatPerDay = Integer.parseInt(scanner.nextLine());
            catFood += foodCatPerDay;
            if (i % 3 == 0) {
                biscuits += Math.round(foodDogPerDay + foodCatPerDay) * 0.1;
            }
        }
        double eatenFoodPercent = (dogFood + catFood) / food * 100;
        double eatenFoodDogPercent = dogFood / (dogFood + catFood) * 100;
        double eatenFoodCatPercent = catFood / (dogFood + catFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", eatenFoodPercent);
        System.out.printf("%.2f%% eaten from the dog.\n", eatenFoodDogPercent);
        System.out.printf("%.2f%% eaten from the cat.", eatenFoodCatPercent);
    }
}