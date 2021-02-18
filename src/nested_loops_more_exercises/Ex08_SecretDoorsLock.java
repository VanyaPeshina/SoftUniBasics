package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex08_SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 2; k <= c; k++) {
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