package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PI = Math.PI;
        double rad = Double.parseDouble(scanner.nextLine());

        double deg = rad * 180 / PI;
        System.out.printf("%.0f", deg);
    }
}
