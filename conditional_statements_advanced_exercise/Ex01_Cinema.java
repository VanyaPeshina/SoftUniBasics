package com.soft.uni.fundamentals.conditional_statements_advanced_exercise;

import java.util.Scanner;

public class Ex01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieType = scanner.nextLine();
        int line = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int places = line * columns;
        double income = 0;

        switch (movieType) {
            case "Premiere":
                income = places * 12.00;
                break;

            case "Normal":
                income = places * 7.50;
                break;

            case "Discount":
                income = places * 5.00;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}