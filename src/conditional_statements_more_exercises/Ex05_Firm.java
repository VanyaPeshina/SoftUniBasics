package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class Ex05_Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursForProject = Integer.parseInt(scanner.nextLine());
        int daysForProject = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double workingHours = daysForProject * 8;
        double education = workingHours * 0.10;
        double totalHours = workingHours - education;
        double extraLabor = (daysForProject * 2) * workers;

        double hoursSum = Math.floor(totalHours + extraLabor);
        double hoursX = Math.abs(hoursSum - hoursForProject);

        if (hoursSum >= hoursForProject) {
            System.out.printf("Yes!%.0f hours left.", hoursX);
        }
        else if (hoursSum < hoursForProject){
            System.out.printf("Not enough time!%.0f hours needed.", hoursX);
        }
    }
}