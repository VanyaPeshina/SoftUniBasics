package com.soft.uni.fundamentals.conditional_statements_more_exercises;

import java.util.Scanner;

public class Ex04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String when = scanner.nextLine();

        double taxi = 0;
        double bus = n * 0.09;
        double train = n * 0.06;

        if (when.equals("day") ) {
                taxi = (n * 0.79) + 0.70;
        }
        else if (when.equals("night")) {
            taxi = (n * 0.90) + 0.70;
        }

        if (n < 20) {
            System.out.printf("%.2f", taxi);
        }
        else if (n >= 20 && n < 100) {
            double transport = Math.min(taxi, bus);
            System.out.printf("%.2f", transport);
        }
        else if (n >= 100) {
            double transport = Math.min(bus, train);
            System.out.printf("%.2f", transport);
        }
    }
}