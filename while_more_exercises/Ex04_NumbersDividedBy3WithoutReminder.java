package com.soft.uni.fundamentals.while_more_exercises;

import java.util.Scanner;

public class Ex04_NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}