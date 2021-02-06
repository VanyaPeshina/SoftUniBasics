package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < number) {
            int number2 = Integer.parseInt(scanner.nextLine());
            sum += number2;
        }
        System.out.println(sum);
    }
}