package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());

        for (int i = firstPair; i <= (firstPair + diffFirst); i++) {
            for (int j = secondPair; j <= (secondPair + diffSecond); j++) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {
                    System.out.printf("%d%d%n", i, j);
                }
            }
        }
    }
}