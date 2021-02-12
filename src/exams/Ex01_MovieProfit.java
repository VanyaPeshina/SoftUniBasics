package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double cinemaPercent = Double.parseDouble(scanner.nextLine());

        double income = tickets * ticketPrice * days;
        double percent = cinemaPercent / 100;
        double tax = income * percent;
        double total = income - tax;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, total);
    }
}