package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex05_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameActor = scanner.nextLine();
        double pointsAc = Double.parseDouble(scanner.nextLine());
        int evaluators = Integer.parseInt(scanner.nextLine());

        double pointsSum = pointsAc;

        for (int i = 1; i <= evaluators; i++) {
            String evaluatorName = scanner.nextLine();
            double pointsEv = Double.parseDouble(scanner.nextLine());

            pointsSum += (evaluatorName.length() * pointsEv) / 2;
            if (pointsSum >= 1250.5) {
                break;
            }
        }
        if (pointsSum >= 1250.50) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",nameActor,pointsSum);
        } else {
            double pointsNeeded = 1250.50 - pointsSum;
            System.out.printf("Sorry, %s you need %.1f more!",nameActor,pointsNeeded);
        }
    }
}