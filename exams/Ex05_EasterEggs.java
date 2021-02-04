package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintedEggs = Integer.parseInt(scanner.nextLine());

        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;

        for (int i = 1; i <= paintedEggs; i++) {
            String color = scanner.nextLine();

            if (color.equals("red")) {
                redEggs++;
            } else if (color.equals("orange")) {
                orangeEggs++;
            } else if (color.equals("blue")) {
                blueEggs++;
            } else {
                greenEggs++;
            }
        }
        int maxEggs = 0;
        String color2 = "";
        if (redEggs > orangeEggs && redEggs > blueEggs && redEggs > greenEggs) {
            maxEggs = redEggs;
            color2 = "red";
        } else if (orangeEggs > redEggs && orangeEggs > blueEggs && orangeEggs > greenEggs) {
            maxEggs = orangeEggs;
            color2 = "orange";
        } else if (blueEggs > redEggs && blueEggs > orangeEggs && blueEggs > greenEggs) {
            maxEggs = blueEggs;
            color2 = "blue";
        } else {
            maxEggs = greenEggs;
            color2 = "green";
        }

        System.out.printf("Red eggs: %d\n",redEggs);
        System.out.printf("Orange eggs: %d\n",orangeEggs);
        System.out.printf("Blue eggs: %d\n",blueEggs);
        System.out.printf("Green eggs: %d\n",greenEggs);
        System.out.printf("Max eggs: %d -> %s",maxEggs,color2);
    }
}