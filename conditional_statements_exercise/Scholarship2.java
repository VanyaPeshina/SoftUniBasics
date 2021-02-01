package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;

public class Scholarship2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double scholarshipS = 0;
        double scholarshipX = 0;

        String output = "";

        if (grade >= 4.50) {
            if (income < minSalary) {
                scholarshipS = Math.floor(minSalary * 0.35);
            }
        }
        if (grade >= 5.50) {
            scholarshipX = Math.floor(grade * 25);
        }

        if (scholarshipS == 0 && scholarshipX == 0){
            output = "You cannot get a scholarship!";
        } else if (scholarshipS > scholarshipX) {
            output = String.format("You get a Social scholarship %.0f BGN", scholarshipS);
        } else if (scholarshipX >= scholarshipS) {
            output = String.format("You get a scholarship for excellent results %.0f BGN", scholarshipX);
        }
        System.out.printf(output);
    }
}
