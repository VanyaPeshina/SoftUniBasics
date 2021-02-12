package com.soft.uni.fundamentals.simple_operations_more_exercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseLength = Double.parseDouble(scanner.nextLine());
        double roofHeight = Double.parseDouble(scanner.nextLine());

        double houseFrontSide = (houseHeight * houseHeight) - (1.2 * 2);
        double houseBackSide = houseHeight * houseHeight;
        double houseSides =  ((houseHeight * houseLength) - (1.5 * 1.5)) * 2;

        double houseRoofFront = (houseHeight * roofHeight);
        double houseRoofSide = (houseHeight * houseLength) * 2;

        double greenPaintNeeded = (houseFrontSide + houseBackSide + houseSides) / 3.4;
        double redPaintNeeded = (houseRoofFront + houseRoofSide) / 4.3;

        System.out.printf("%.2f \n", greenPaintNeeded);
        System.out.printf("%.2f", redPaintNeeded);
    }
}
