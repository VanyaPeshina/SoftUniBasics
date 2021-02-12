package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double water1 = pipe1 * time;
        double water2 = pipe2 * time;
        double waterSum = water1 + water2;

        double workPipe1 = (water1 / v) * 100;
        double workPipe2 = (water2 / v) * 100;
        double percentPipes = workPipe1 + workPipe2;
        double percentPipe1 = (workPipe1 / percentPipes) * 100;
        double percentPipe2 = (workPipe2 / percentPipes) * 100;

        double overflow = waterSum - v;

        if (v >= waterSum) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentPipes, percentPipe1, percentPipe2);
        }
        else if (v < waterSum) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", time, overflow);
        }
    }
}