package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerM = Double.parseDouble(scanner.nextLine());

        double time = distance * secPerM;
        double delay = Math.floor(distance / 15);
        double delayInSeconds = delay * 12.5;
        double timeNeeded = time + delayInSeconds;
        double loose = timeNeeded - record;

        if (record > timeNeeded) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeNeeded);
        }
        else if (record < timeNeeded) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", loose);
        }
        else if (record == timeNeeded) {
                System.out.println("No, he failed! He was 0.00 seconds slower.");
        }
    }
}
