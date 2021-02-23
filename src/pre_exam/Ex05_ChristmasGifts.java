package src.pre_exam;

import java.util.Scanner;

public class Ex05_ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String age = scanner.nextLine();

        int under16 = 0;
        int above16 = 0;

        while (!age.equals("Christmas")) {
            int years = Integer.parseInt(age);
            if (years <= 16) {
                under16++;

            } else {
                above16++;
            }
            age = scanner.nextLine();
        }
        int sumToys = under16 * 5;
        int sumPullover = above16 * 15;

        System.out.printf("Number of adults: %d%n", above16);
        System.out.printf("Number of kids: %d%n", under16);
        System.out.printf("Money for toys: %d%n", sumToys);
        System.out.printf("Money for sweaters: %d", sumPullover);
    }
}