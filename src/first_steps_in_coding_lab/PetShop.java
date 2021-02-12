package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());

        double sumDogs = dogs * 2.50;
        double sumAnimals = animals * 4.00;

        double result = sumDogs + sumAnimals;
        System.out.println(result);
    }
}
