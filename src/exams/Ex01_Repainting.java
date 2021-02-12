package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double plasticNeeded2M = Double.parseDouble(scanner.nextLine());
        double paintNeededL = Double.parseDouble(scanner.nextLine());
        double thinnerNeededL = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double plasticPrice = 1.50;
        double paintPrice = 14.50;
        double thinnerPrice = 5;
        double pack = 0.4;

        double extraPaint = paintNeededL * 0.1;
        double paint = (paintNeededL + extraPaint) * paintPrice;
        double plastic = (plasticNeeded2M + 2) * plasticPrice;
        double thinner = thinnerNeededL * thinnerPrice;

        double sum = paint + plastic + thinner + pack;
        double laborPrice = (sum * 0.30) * time;
        double total = sum + laborPrice;

        System.out.printf("Total expenses: %.2f lv.", total);
    }
}