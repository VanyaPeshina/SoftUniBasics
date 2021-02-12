package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double sqS = a * a;
            System.out.printf("%.3f", sqS);
        }
        else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double rctS = a * b;
            System.out.printf("%.3f", rctS);
        }
        else if (figure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double circleS = Math.PI * (r * r);
            System.out.printf("%.3f", circleS);
        }
        else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            double trS = (a * h) / 2;
            System.out.printf("%.3f", trS);
        }
    }
}
