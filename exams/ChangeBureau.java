package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chIoan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bcInLv = bitcoin * 1168;
        double chIoanInLv = (chIoan * 0.15) * 1.76;
        double sum = (bcInLv + chIoanInLv) / 1.95;
        double moneyAvailable = sum - (sum * (commission * 0.01));

        System.out.printf("%.2f", moneyAvailable);

    }
}
