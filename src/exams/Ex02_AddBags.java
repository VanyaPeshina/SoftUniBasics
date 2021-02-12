package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaggage20Plus = Double.parseDouble(scanner.nextLine());
        double kgBaggage = Double.parseDouble(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int amountBaggage = Integer.parseInt(scanner.nextLine());

        double priceBaggage10Under = priceBaggage20Plus * 0.2;
        double priceBaggage20Under = priceBaggage20Plus * 0.5;
        double sum = 0;

        if (daysLeft > 30) {
            if (kgBaggage > 20) {
                priceBaggage20Plus *= 1.1;
                sum += priceBaggage20Plus;
            } else if (kgBaggage <= 20 && kgBaggage >= 10) {
                priceBaggage20Under *= 1.1;
                sum += priceBaggage20Under;
            } else if (kgBaggage < 10) {
                priceBaggage10Under *= 1.1;
                sum += priceBaggage10Under;
            }
        } else if (daysLeft <= 30 && daysLeft >= 7) {
            if (kgBaggage > 20) {
                priceBaggage20Plus *= 1.15;
                sum += priceBaggage20Plus;
            } else if (kgBaggage <= 20 && kgBaggage >= 10) {
                priceBaggage20Under *= 1.15;
                sum += priceBaggage20Under;
            } else if (kgBaggage < 10) {
                priceBaggage10Under *= 1.15;
                sum += priceBaggage10Under;
            }
        } else {
            if (kgBaggage > 20) {
                priceBaggage20Plus *= 1.4;
                sum += priceBaggage20Plus;
            } else if (kgBaggage <= 20 && kgBaggage >= 10) {
                priceBaggage20Under *= 1.4;
                sum += priceBaggage20Under;
            } else if (kgBaggage < 10) {
                priceBaggage10Under *= 1.4;
                sum += priceBaggage10Under;
            }
        }
        sum *= amountBaggage;
        System.out.printf("The total price of bags is: %.2f lv.", sum);
    }
}