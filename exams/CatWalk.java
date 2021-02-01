package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class CatWalk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalk = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int cal = Integer.parseInt(scanner.nextLine());

        int burnedCal = (minWalk * walksPerDay) * 5;

        if (burnedCal >= (cal - (cal * 0.50))) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCal);
        }
        else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCal);
        }
    }
}
