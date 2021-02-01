package com.soft.uni.fundamentals.conditional_statements_advanced_lab;

import java.util.Scanner;

public class Ex12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        switch (town) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.05;
                    System.out.printf("%.2f", commission);
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.07;
                    System.out.printf("%.2f", commission);
                } else if (s > 1000 && s <= 10_000) {
                    commission = s * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (s > 10_000) {
                    commission = s * 0.12;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                } break;

            case "Varna":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.045;
                    System.out.printf("%.2f", commission);
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.075;
                    System.out.printf("%.2f", commission);
                } else if (s > 1000 && s <= 10_000) {
                    commission = s * 0.10;
                    System.out.printf("%.2f", commission);
                } else if (s > 10_000) {
                    commission = s * 0.13;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                } break;

            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    commission = s * 0.055;
                    System.out.printf("%.2f", commission);
                } else if (s > 500 && s <= 1000) {
                    commission = s * 0.08;
                    System.out.printf("%.2f", commission);
                } else if (s > 1000 && s <= 10_000) {
                    commission = s * 0.12;
                    System.out.printf("%.2f", commission);
                } else if (s > 10_000) {
                    commission = s * 0.145;
                    System.out.printf("%.2f", commission);
                } else {
                    System.out.println("error");
                } break;

            default:
                System.out.println("error");
        }
    }
}