package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double load = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;

        while (!input.equals("End")) {
            double volume = Double.parseDouble(input);
            if (volume <= load) {
                if (counter % 3 == 0 && counter != 0) {
                    load -= volume * 1.1;
                } else {
                    load -= volume;
                }
                counter++;
                input = scanner.nextLine();
            } else {
                break;
            }
        }
        if (input.equals("End")) {
            System.out.println("Congratulations! All suitcases are loaded!");
        } else {
            System.out.println("No more space!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}