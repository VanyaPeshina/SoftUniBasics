package src.pre_exam2;

import java.util.Scanner;

public class Ex01_ToTheMoonAndBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuelPer100km = Double.parseDouble(scanner.nextLine());

        double distance = 384_400 * 2;
        double time = Math.ceil(distance / averageSpeed) + 3;
        double fuel = fuelPer100km * distance / 100;

        System.out.printf("%.0f%n%.0f", time, fuel);
    }
}