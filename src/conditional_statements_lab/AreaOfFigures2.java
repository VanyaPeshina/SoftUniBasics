package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class AreaOfFigures2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        switch (figure) {
            case "square":
            double a = Double.parseDouble(scanner.nextLine());
            double sqS = a * a;
            System.out.printf("%.3f", sqS);
            break;

            case "rectangle":
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double rctS = b * c;
            System.out.printf("%.3f", rctS);
            break;

            case "circle":
            double r = Double.parseDouble(scanner.nextLine());
            double circleS = Math.PI * (r * r);
            System.out.printf("%.3f", circleS);
            break;

            case "triangle":
            double d = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double trS = (d * h) / 2;
            System.out.printf("%.3f", trS);
            break;
        }
    }
}
