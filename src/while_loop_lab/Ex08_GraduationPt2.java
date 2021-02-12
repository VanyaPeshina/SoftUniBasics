package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex08_GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int stage = 1;
        double sum = 0;
        int excluded = 0;

        while (stage <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.0) {
                sum += grade;
                stage++;
            } else {
                excluded++;
            }
            if (excluded > 1) {
                break;
            }
        }
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade", name, stage);
        } else {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }
    }
}