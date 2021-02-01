package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int epLength = Integer.parseInt(scanner.nextLine());
        double freeTime = Double.parseDouble(scanner.nextLine());

        double lunch = freeTime / 8;
        double rest = freeTime / 4;
        double movieTime = freeTime - lunch - rest;
        double timePlus = Math.ceil(movieTime - epLength);
        double timeNeeded = Math.ceil(epLength - movieTime);

        if (epLength <= movieTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, timePlus);
        } else if (epLength > movieTime) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, timeNeeded);
        }
    }
}