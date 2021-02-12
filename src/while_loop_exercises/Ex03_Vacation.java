package com.soft.uni.fundamentals.while_loop_exercises;

import java.util.Scanner;

public class Ex03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetNeeded = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int days = 0;

        while (money < budgetNeeded) {
            String act = scanner.nextLine();
            double moneyDaily = Double.parseDouble(scanner.nextLine());
            days++;
            if (act.equals("spend")) {
                counter++;
                if (moneyDaily >= money) {
                    money = 0;
                } else {
                    money -= moneyDaily;
                }
            } else if (act.equals("save")) {
                money += moneyDaily;
                counter = 0;
            }
            if (counter == 5) {
                break;
            }
        }
        if (money >= budgetNeeded) {
            System.out.printf("You saved the money for %d days.", days);
        }
        if (counter == 5) {
            System.out.printf("You can't save the money.%n%d", days);
        }
    }
}