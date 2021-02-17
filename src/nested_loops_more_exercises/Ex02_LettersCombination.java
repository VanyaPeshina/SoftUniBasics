package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex02_LettersCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextLine().charAt(0);
        int second = scanner.nextLine().charAt(0);
        int ignore = scanner.nextLine().charAt(0);

        int counter = 0;

        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                for (int k = first; k <= second; k++) {
                    if (i != ignore && j != ignore && k != ignore) {
                        counter++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.printf("%d", counter);
    }
}