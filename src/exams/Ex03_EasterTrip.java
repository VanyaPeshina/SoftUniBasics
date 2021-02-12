package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String date = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double sum= 0;

        if (destination.equals("France")) {
            if (date.equals("21-23")) {
                sum = nights * 30;
            } else if (date.equals("24-27")) {
                sum = nights * 35;
            } else if (date.equals("28-31")) {
                sum = nights * 40;
            }
        } else if (destination.equals("Italy")) {
            if (date.equals("21-23")) {
                sum = nights * 28;
            } else if (date.equals("24-27")) {
                sum = nights * 32;
            } else if (date.equals("28-31")) {
                sum = nights * 39;
            }
        } else if (destination.equals("Germany")) {
            if (date.equals("21-23")) {
                sum = nights * 32;
            } else if (date.equals("24-27")) {
                sum = nights * 37;
            } else if (date.equals("28-31")) {
                sum = nights * 43;
            }
        } System.out.printf("Easter trip to %s : %.2f leva.", destination, sum);
    }
}