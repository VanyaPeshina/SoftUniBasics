package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double scholarshipS = 0;
        double scholarshipX = 0;
        boolean approved = false;

        String output = "";

        if (averageGrade > 4.5 && income < minimalSalary) {
                scholarshipS = Math.floor(minimalSalary * 0.35);
                approved = true;
            }
        if (averageGrade >= 5.5) {
            scholarshipX = Math.floor(averageGrade * 25);
            approved = true;
        }

        if (!approved) {
            output = "You cannot get a scholarship!";
        } else if (scholarshipS > scholarshipX) {
            output = String.format("You get a Social scholarship %.0f BGN", scholarshipS);
        } else if (scholarshipX >= scholarshipS) {
            output = String.format("You get s scholarship for excellent results %.0f BGN", scholarshipX);
        }
        System.out.println(output);
        //не е решение, имаш втори вариант
    }
}