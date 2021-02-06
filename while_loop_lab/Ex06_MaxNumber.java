package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int maxN = Integer.MIN_VALUE;

        while (!command.equals("Stop")) {
            int n = Integer.parseInt(command);
            if (n > maxN) {
                maxN = n;
            }
            command = scanner.nextLine();
        }
        System.out.print(maxN);
    }
}