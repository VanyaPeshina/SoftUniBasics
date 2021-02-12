package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class GreaterNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println(Math.max(a,b));
    }
}
