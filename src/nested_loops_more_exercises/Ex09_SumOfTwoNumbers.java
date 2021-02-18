package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex09_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int counterPositive = 0;
        boolean positive = false;

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                counter++;
                if (i + j == magicNumber) {
                    counterPositive++;
                }
                if (counterPositive == 1) {
                    positive = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    break;
                }
            }
            if (positive) {
                break;
            }
        }
        if (counterPositive == 0) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}