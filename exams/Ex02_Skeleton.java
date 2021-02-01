package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minC = Integer.parseInt(scanner.nextLine());
        int secC = Integer.parseInt(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        int sec100m = Integer.parseInt(scanner.nextLine());

        double sumSec = (minC * 60) + secC;
        double delay = (m / 120) * 2.5;
        double sumSecPersonalTime = ((m / 100) * sec100m) - delay;

        if (sumSecPersonalTime <= sumSec) {
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.", sumSecPersonalTime);
        } else {
            double secondsNeeded = sumSecPersonalTime - sumSec;
            System.out.printf("No, Marin failed! He was %.3f second slower.", secondsNeeded);
        }
    }
}