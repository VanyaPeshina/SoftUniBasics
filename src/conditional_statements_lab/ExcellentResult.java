package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = Integer.parseInt(scanner.nextLine());

        if (result >= 5 && result <= 6) {
            System.out.println("Excellent!");
        }
    }
}
