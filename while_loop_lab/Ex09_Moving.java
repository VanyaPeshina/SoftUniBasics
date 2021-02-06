package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex09_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int freeCubicM = width * length * height;
        int sum = 0;

        while (!command.equals("Done")) {
            sum += Integer.parseInt(command);
            if (sum >= freeCubicM) {
                break;
            }
            command = scanner.nextLine();
        }
        int diff = Math.abs(freeCubicM - sum);
        if (sum < freeCubicM) {
            System.out.printf("%d Cubic meters left.", diff);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        }
    }
}