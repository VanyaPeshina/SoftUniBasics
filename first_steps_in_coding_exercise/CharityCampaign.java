package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int campaignDays = Integer.parseInt(scanner.nextLine());
        int bakers = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesMoney = (bakers * cakes * campaignDays) * 45;
        double wafflesMoney = (bakers * waffles * campaignDays) * 5.80;
        double pancakesMoney = (bakers * pancakes * campaignDays) * 3.20;

        double cost = (cakesMoney + wafflesMoney + pancakesMoney) * 0.125;
        double charitySum = (cakesMoney + wafflesMoney + pancakesMoney) - cost;

        System.out.printf("%.2f", charitySum);


    }
}
