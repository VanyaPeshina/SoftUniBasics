package com.soft.uni.fundamentals.while_loop_exercises;

import java.util.Scanner;

public class Ex04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String steps = "";
        int goal = 10_000;
        int countSteps = 0;

        while (countSteps < goal) {
            steps = scanner.nextLine();
            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                countSteps += Integer.parseInt(steps);
                break;
            }
            countSteps += Integer.parseInt(steps);
        }
        int diff = Math.abs(goal - countSteps);
        if (countSteps >= goal) {
            System.out.printf("Goal reached! Good job!\n%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);

        }
    }
}