package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int lotsPurchased = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (size.equals("Large")) {
            if (color.equals("Red")) {
                sum = lotsPurchased * 16;
            } else if (color.equals("Green")) {
                sum = lotsPurchased * 12;
            } else if (color.equals("Yellow")) {
                sum = lotsPurchased * 9;
            }
        } else if (size.equals("Medium")) {
            if (color.equals("Red")) {
                sum = lotsPurchased * 13;
            } else if (color.equals("Green")) {
                sum = lotsPurchased * 9;
            } else if (color.equals("Yellow")) {
                sum = lotsPurchased * 7;
            }
        } else if (size.equals("Small")) {
            if (color.equals("Red")) {
                sum = lotsPurchased * 9;
            } else if (color.equals("Green")) {
                sum = lotsPurchased * 8;
            } else if (color.equals("Yellow")) {
                sum = lotsPurchased * 5;
            }
        } double total = sum * 0.65;
        System.out.printf("%.2f leva.", total);
    }
}