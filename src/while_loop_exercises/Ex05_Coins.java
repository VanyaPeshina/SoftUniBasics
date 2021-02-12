package com.soft.uni.fundamentals.while_loop_exercises;

import java.util.Scanner;

public class Ex05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());

        double coins = change * 100;
        double counterLv = 0;

        while (coins > 0) {
            if (coins >= 200) {
                counterLv++;
                coins -= 200;
            } else if (coins >= 100) {
                counterLv++;
                coins -= 100;
            } else if (coins >= 50) {
                counterLv++;
                coins -= 50;
            } else if (coins >= 20) {
                counterLv++;
                coins -= 20;
            } else if (coins >= 10) {
                counterLv++;
                coins -= 10;
            } else if (coins >= 5) {
                counterLv++;
                coins -= 5;
            } else if (coins >= 2) {
                counterLv++;
                coins -= 2;
            } else if (coins >= 1) {
                counterLv++;
                coins -= 1;
            } else {
                break;
            }
        }
        System.out.printf("%.0f",counterLv);
    }
}