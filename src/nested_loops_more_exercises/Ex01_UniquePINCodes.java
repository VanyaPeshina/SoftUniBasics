package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex01_UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 1; j <= secondNumber; j++) {
                for (int k = 1; k <= thirdNumber; k++) {
                    if (i % 2 == 0 && k % 2 == 0) {
                        if (j == 2 || j == 3 || j == 5 || j == 7) {
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}