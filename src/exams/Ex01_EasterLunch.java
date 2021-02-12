package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterBread = Integer.parseInt(scanner.nextLine());
        int eggsPacks = Integer.parseInt(scanner.nextLine());
        int biscuitsKG = Integer.parseInt(scanner.nextLine());

        double easterBreadPrice = 3.20;
        double eggsPrice = 4.35;
        double biscuitsPrice = 5.40;
        double paintPricePerEgg = 0.15;

        double lunchPrice = (easterBread * easterBreadPrice)
                          + (eggsPacks * eggsPrice + (eggsPacks * 12 * paintPricePerEgg))
                          + (biscuitsKG * biscuitsPrice);

        System.out.printf("%.2f", lunchPrice);
    }
}
