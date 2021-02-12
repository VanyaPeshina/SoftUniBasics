package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals(pass)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",name);
    }
}