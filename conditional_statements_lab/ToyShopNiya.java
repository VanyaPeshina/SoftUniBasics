package com.soft.uni.fundamentals.conditional_statements_lab;

import java.util.Scanner;

public class ToyShopNiya {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);

            Double holidayPrice = Double.parseDouble(Scanner.nextLine());
            int puzzle = Integer.parseInt(Scanner.nextLine());
            int dolls = Integer.parseInt(Scanner.nextLine());
            int bears = Integer.parseInt(Scanner.nextLine());
            int minions = Integer.parseInt(Scanner.nextLine());
            int trucks = Integer.parseInt(Scanner.nextLine());

            int numberOfToys = puzzle + dolls + bears + minions + trucks;
            double Sum = puzzle * 2.6 + dolls * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;

            double endSum;
            if (numberOfToys >= 50) {
                endSum = 0.75 * Sum;
            }
            else {
                endSum = Sum;
            }
            double finalSum = 0.9 * endSum;
            if (finalSum >= holidayPrice) {
                double moneyLeft = finalSum - holidayPrice;
                System.out.printf("Yes! %.2f lv left.", moneyLeft);
            }
            else {
                double moneyNeeded = holidayPrice - finalSum;
                System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
            }
        }
}
