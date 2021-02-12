package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int racer1 = Integer.parseInt(scanner.nextLine());
        int racer2 = Integer.parseInt(scanner.nextLine());
        int racer3 = Integer.parseInt(scanner.nextLine());

        int time = racer1 + racer2 + racer3;
        int minutes = time / 60;
        int seconds = time % 60;


        if (seconds < 10)
            System.out.printf("%d:0%d", minutes, seconds);
        else
            System.out.printf("%d:%d", minutes, seconds);
    }
}
