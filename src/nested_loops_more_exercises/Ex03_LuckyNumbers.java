package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex03_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        int a = i + j;
                        int b = k + l;
                        if (a == b && n % a == 0) {
                                System.out.printf("%d%d%d%d ", i,j,k,l);
                        }
                    }
                }
            }
        }
    }
}