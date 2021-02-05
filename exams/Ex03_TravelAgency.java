package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (pack) {
                    case "withEquipment":
                        price = 100;
                        if (vip.equals("yes")) {
                            price *= 0.9;
                        }
                        break;
                    case "noEquipment":
                        price = 80;
                        if (vip.equals("yes")) {
                            price *= 0.95;
                        }
                        break;
                }

            case "Varna":
            case "Burgas":
                switch (pack) {
                    case "withBreakfast":
                        price = 130;
                        if (vip.equals("yes")) {
                            price *= 0.88;
                        }
                        break;

                    case "noBreakfast":
                        price = 100;
                        if (vip.equals("yes")) {
                            price *= 0.93;
                        }
                        break;
                }
        }
        double priceSum = price * days;
        if (days > 7) {
            priceSum = priceSum - price;
        }

        if (days < 1) {
            System.out.println("Days must be positive number!");
        } else if (!town.equals("Bansko") && !town.equals("Borovets") && !town.equals("Varna") && !town.equals("Burgas")) {
            System.out.println("Invalid input!");
        } else if (!pack.equals("withBreakfast") && !pack.equals("noBreakfast") && !pack.equals("withEquipment") && !pack.equals("noEquipment")) {
            System.out.println("Invalid input!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", priceSum);
        }
    }
}