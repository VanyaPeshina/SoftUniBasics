package com.soft.uni.fundamentals.for_loop_lab;

import java.util.Scanner;

public class Ex11_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());

        int toy = 0;
        int money = 0;
        int sum = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 != 0) {
                toy++;
            } else {
                money += 10;
                sum += money;
                sum -= 1;
            }
        }
        double toysMoney = toy * priceToy;
        double total = toysMoney + sum;
        if (total >= price) {
            System.out.printf("Yes! %.2f", (total-price));
        } else if (total < price) {
            System.out.printf("No! %.2f", (price-total));
        }
    }
}