package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSecPerM = Double.parseDouble(scanner.nextLine());

        double time = distance * timeInSecPerM;
        double delay = Math.floor(distance / 50);
        double delaySeconds = delay * 30;
        double timeNeeded = time + delaySeconds;
        double loose = timeNeeded - record;

        if (record < timeNeeded) {
            System.out.printf("No! He was %.2f seconds slower.", loose);
        }
        else if (record > timeNeeded) {
            System.out.printf("Yes! The new record is %.2f seconds.", timeNeeded);
        }
        else if (record == timeNeeded) {
            System.out.println("No! He was 0.00 seconds slower.");
        }
    }
}
