package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int readingSpeed = Integer.parseInt(scanner.nextLine());
        int daysPerBook = Integer.parseInt(scanner.nextLine());

        int timeToReadTheBook = pagesInBook / readingSpeed;
        int hoursPerDay = timeToReadTheBook / daysPerBook;

        System.out.println(hoursPerDay);
    }
}
