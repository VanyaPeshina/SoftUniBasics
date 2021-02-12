package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (score <= 100 && !((score % 2) == 0)) {
                System.out.println(bonus = 5);
                System.out.println(score + bonus);
        }

        else if (score <= 100 && ((score % 2) == 0)) {
            System.out.println(bonus = 6);
            System.out.println(score + bonus);
        }

        else if  (score > 100 && score < 1000 && !((score % 2) == 0)) {
            System.out.println(bonus = score * 0.2);
            System.out.println(score + bonus);
        }

        else if  (score > 100 && score < 1000 && ((score % 2) == 0)) {
            System.out.println(bonus = (score * 0.2) + 1);
            System.out.println(score + bonus);
        }

        else if (score > 1000 && !((score % 2) == 0)) {
            System.out.println(bonus = score * 0.1);
            System.out.println(score + bonus);
        }

        else if (score > 1000 && ((score % 2) == 0)) {
            System.out.println(bonus = (score * 0.1) + 1);
            System.out.println(score + bonus);
        }
    }
}