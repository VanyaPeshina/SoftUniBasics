package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class metricConverter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double a = Double.parseDouble(scanner.nextLine());
            String text = scanner.nextLine().toLowerCase();
            String result = scanner.nextLine().toLowerCase();

            if (text.equals("m") && result.equals("cm")) {
                result = String.valueOf(a*100);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
            else if (text.equals("m") && result.equals("mm")) {
                result = String.valueOf(a*1000);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
            else if (text.equals("cm") && result.equals("m")) {
                result = String.valueOf(a/100);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
            else if (text.equals("cm") && result.equals("mm")) {
                result = String.valueOf(a * 10);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
            else if (text.equals("mm") && result.equals("m")) {
                result = String.valueOf(a / 1000);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
            else if (text.equals("mm") && result.equals("cm")) {
                result = String.valueOf(a / 10);
                double b = Double.parseDouble(result);
                System.out.printf("%.3f", b);
            }
        }
    }

