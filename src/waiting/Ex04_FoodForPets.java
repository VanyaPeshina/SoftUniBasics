package com.soft.uni.fundamentals.waiting;

import java.util.Scanner;

public class Ex04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());
        int foodDogPerDay = Integer.parseInt(scanner.nextLine());
        int foodCatPerDay = Integer.parseInt(scanner.nextLine());

        double sumFood = days * food;
        double bisquits = sumFood * 0.1;


    }
}
