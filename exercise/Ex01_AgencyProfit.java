package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double netPriceAdults = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());

        double netPriceKids = netPriceAdults * 0.3;
        double sumAdults = (netPriceAdults + servicePrice) * ticketsAdults;
        double sumKids = (netPriceKids + servicePrice) * ticketsKids;
        double profit = (sumAdults + sumKids) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);
    }
}