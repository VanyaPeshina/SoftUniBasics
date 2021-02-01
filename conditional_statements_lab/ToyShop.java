package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());

        int orderPieces = puzzles + dolls + teddyBears + minions + toyTrucks;
        double orderPrice = puzzles * 2.60 + dolls * 3 + teddyBears * 4.10 + minions * 8.20 + toyTrucks * 2;

                if (orderPieces >= 50) {
                    double priceWithDiscount = orderPrice - (orderPrice * 0.25);
                    double moneyLeft = priceWithDiscount - (priceWithDiscount * 0.10);
                    double tripMoney = moneyLeft - tripPrice;
                    double moneyNeeded = tripPrice - moneyLeft;
                    if (moneyLeft >= tripPrice)
                        System.out.printf("Yes! %.2f lv left.", tripMoney);
                    else if (moneyLeft < tripPrice)
                        System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
                }

                if (orderPieces <= 49) {
                    double moneyLeft2 = orderPrice - (orderPrice * 0.10);
                    double tripMoney2 = moneyLeft2 - tripPrice;
                    double moneyNeeded2 = tripPrice - moneyLeft2;
                    if (moneyLeft2 >= tripPrice)
                        System.out.printf("Yes! %.2f lv left.", tripMoney2);
                    else if (moneyLeft2 < tripPrice)
                        System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded2);
                }

    }
}
