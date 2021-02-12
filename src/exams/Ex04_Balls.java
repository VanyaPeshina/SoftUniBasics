package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        for (int i = 1; i <= amount; i++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                sum += 5;
                redBalls++;
            } else if (color.equals("orange")) {
                sum += 10;
                orangeBalls++;
            } else if (color.equals("yellow")) {
                sum += 15;
                yellowBalls++;
            } else if (color.equals("white")) {
                sum += 20;
                whiteBalls++;
            } else if (color.equals("black")) {
                sum /= 2;
                blackBalls++;
            } else {
                otherBalls++;
            }
        }
        System.out.printf("Total points: %d%n", sum);
        System.out.printf("Points from red balls: %d%n", redBalls);
        System.out.printf("Points from orange balls: %d%n", orangeBalls);
        System.out.printf("Points from yellow balls: %d%n", yellowBalls);
        System.out.printf("Points from white balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}