package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String term = scanner.nextLine();
        String type = scanner.nextLine();
        String mInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (term.equals("one")) {
            if (type.equals("Small") && mInternet.equals("no")) {
                sum = 9.98 * months;
            } else if (type.equals("Small") && mInternet.equals("yes")) {
                sum = (9.98 + 5.50) * months;
            }
            if (type.equals("Middle") && mInternet.equals("no")) {
                sum = 18.99 * months;
            } else if (type.equals("Middle") && mInternet.equals("yes")) {
                sum = (18.99 + 4.35) * months;
            }
            if (type.equals("Large") && mInternet.equals("no")) {
                sum = 25.98 * months;
            } else if (type.equals("Large") && mInternet.equals("yes")) {
                sum = (25.98 + 4.35) * months;
            }
            if (type.equals("ExtraLarge") && mInternet.equals("no")) {
                sum = 35.99 * months;
            } else if (type.equals("ExtraLarge") && mInternet.equals("yes")) {
                sum = (35.99 + 3.85) * months;
            }

        } else if (term.equals("two")) {
            if (type.equals("Small") && mInternet.equals("no")) {
            sum = (8.58 - (8.58 * 0.0375)) * months;
        } else if (type.equals("Small") && mInternet.equals("yes")) {
            double charge = 8.58 + 5.50;
            sum = (charge - (charge * 0.0375)) * months;
        }
            if (type.equals("Middle") && mInternet.equals("no")) {
                sum = (17.09 - (17.09 * 0.0375)) * months;
            } else if (type.equals("Middle") && mInternet.equals("yes")) {
                double charge = 17.09 + 4.35;
                sum = (charge - (charge * 0.0375)) * months;
            }
            if (type.equals("Large") && mInternet.equals("no")) {
                sum = (23.59 - (23.59 * 0.0375)) * months;
            } else if (type.equals("Large") && mInternet.equals("yes")) {
                double charge = 23.59 + 4.35;
                sum = (charge - (charge * 0.0375)) * months;
            }
            if (type.equals("ExtraLarge") && mInternet.equals("no")) {
                sum = (31.79 - (31.79 * 0.0375)) * months;
            } else if (type.equals("ExtraLarge") && mInternet.equals("yes")) {
                double charge = 31.79 + 3.85;
                sum = (charge - (charge * 0.0375)) * months;
            }
        } System.out.printf("%.2f lv.", sum);
    }
}