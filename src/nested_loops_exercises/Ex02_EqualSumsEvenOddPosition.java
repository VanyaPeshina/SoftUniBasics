package src.nested_loops_exercises;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Ex02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = parseInt(scanner.nextLine());
        int secondNumber = parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            String currentNum = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
            }
            if (oddSum == evenSum) {
                System.out.print(i + " ");
            }
        }
    }
}