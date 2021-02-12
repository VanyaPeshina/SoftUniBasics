package com.soft.uni.fundamentals.for_loop_lab;

import java.util.Scanner;

public class Ex02_NumbersNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (; n >= 1 ; n--) {
            System.out.println(n);
        }
    }
}