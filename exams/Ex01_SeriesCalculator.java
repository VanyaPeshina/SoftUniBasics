package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasonsCount = Integer.parseInt(scanner.nextLine());
        int epCount = Integer.parseInt(scanner.nextLine());
        double durationEp = Double.parseDouble(scanner.nextLine());

        double adv = durationEp * 0.2;
        double totalEpDur = durationEp + adv;
        double specialEp = 10;
        double movieDuration = (totalEpDur * epCount) * seasonsCount + (specialEp * seasonsCount);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, movieDuration);
    }
}