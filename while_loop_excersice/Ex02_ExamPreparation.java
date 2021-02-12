package com.soft.uni.fundamentals.while_loop_excersice;

import java.util.Scanner;

public class Ex02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lowGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;
        int gradesCounter = 0;
        int gradesSum = 0;
        int inputCounter = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            gradesCounter += grade;
            gradesSum++;
            inputCounter++;
            if (grade <= 4) {
                counter++;
            }
            if (counter == lowGrades) {
                break;
            }
            lastProblem = input;
            input = scanner.nextLine();
        }
        double averageScore = 1.0 * gradesCounter / gradesSum;
        if (counter == lowGrades) {
            System.out.printf("You need a break, %d poor grades.", counter);
        } else {
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", inputCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}