package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = startPoints;
        int w = 0;

        for (int i = 1; i <= tournaments; i++) {
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                points += 2000;
                w++;
            } else if (stage.equals("F")) {
                points += 1200;
            } else {
                points += 720;
            }
        }
        double averagePoints = 1.0 * (points - startPoints) / tournaments;
        double victoryPercent = 1.0 * w / tournaments * 100;
        System.out.printf("Final points: %d\n", points);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", victoryPercent);
    }
}