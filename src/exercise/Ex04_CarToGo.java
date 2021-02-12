package com.soft.uni.fundamentals.exercise;

import java.util.Scanner;

public class Ex04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String clas = "";
        String car = "";

        switch (season) {
            case "Summer":
                if (budget <= 100) {
                    clas = "Economy class";
                    car = "Cabrio";
                    budget *= 0.35;
                } else if (budget > 100 && budget <= 500) {
                    clas = "Compact class";
                    car = "Cabrio";
                    budget *= 0.45;
                } else {
                    clas = "Luxury class";
                    car = "Jeep";
                    budget *= 0.9;
                } break;

            case "Winter":
                if (budget <= 100) {
                    clas = "Economy class";
                    car = "Jeep";
                    budget *= 0.65;
                } else if (budget > 100 && budget <= 500) {
                    clas = "Compact class";
                    car = "Jeep";
                    budget *= 0.8;
                } else {
                    clas = "Luxury class";
                    car = "Jeep";
                    budget *= 0.9;
                } break;
        }
        System.out.printf("%s\n%s - %.2f", clas,car,budget);
     }
}