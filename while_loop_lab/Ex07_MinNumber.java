package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int minN = Integer.MAX_VALUE;

        while (!command.equals("Stop")) {
            int n = Integer.parseInt(command);
            if (n < minN) {
                minN = n;
            }
            command = scanner.nextLine();
        }
        System.out.print(minN);
    }
}