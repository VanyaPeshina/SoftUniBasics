package com.soft.uni.fundamentals.for_loop_lab;

import java.util.Scanner;

public class Ex08_NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num < numMin) numMin = num;
            if (num > numMax) numMax = num;
        }
        System.out.printf("Max number: %d%nMin number: %d", numMax, numMin);
    }
}