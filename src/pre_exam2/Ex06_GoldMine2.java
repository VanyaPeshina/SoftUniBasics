package src.pre_exam2;

import java.util.Scanner;

public class Ex06_GoldMine2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        int averageExtraction = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int goldPerDay;
        int counterLocations = 0;
        double gold;

        while (locations != counterLocations) {
            counterLocations++;
            gold = 0;

            for (int i = 1; i <= days; i++) {
                goldPerDay = Integer.parseInt(scanner.nextLine());
                gold += goldPerDay;
            }
            double average = gold / days;
            double diff = averageExtraction - average;
            if (average >= averageExtraction) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", average);
            } else {
                System.out.printf("You need %.2f gold.%n", diff);
            }
            if (counterLocations == locations) {
                break;
            }
            averageExtraction = Integer.parseInt(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
        }
    }
}
