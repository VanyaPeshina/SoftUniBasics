package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex04_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double mussala = 0;
        double montBlank = 0;
        double klm = 0;
        double k2 = 0;
        double everest = 0;
        double allPeople = 0;

        for (int i = 1; i <= groups; i++) {
            int count = Integer.parseInt(scanner.nextLine());
            allPeople += count;
            if (count <= 5) {
                mussala += count;
            } else if (count <= 12) {
                montBlank += count;
            } else if (count <= 25) {
                klm += count;
            } else if (count <= 40) {
                k2 += count;
            } else {
                everest += count;
            }
        }
        double mussalaPercent = mussala / allPeople * 100;
        double montBlankPercent = montBlank / allPeople * 100;
        double klmPercent = klm / allPeople * 100;
        double k2Percent = k2 / allPeople * 100;
        double everestPercent = everest / allPeople * 100;

        System.out.printf("%.2f%%\n",mussalaPercent);
        System.out.printf("%.2f%%\n",montBlankPercent);
        System.out.printf("%.2f%%\n",klmPercent);
        System.out.printf("%.2f%%\n",k2Percent);
        System.out.printf("%.2f%%",everestPercent);
    }
}