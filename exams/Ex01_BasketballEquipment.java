package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trainingFee = Double.parseDouble(scanner.nextLine());

        double sneakers = trainingFee - (trainingFee * 0.4);
        double outfit = sneakers - (sneakers * 0.2);
        double ball = outfit * 0.25;
        double accs = ball * 0.2;
        double sum = trainingFee + sneakers + outfit + ball + accs;

        System.out.printf("%.2f", sum);
    }
}