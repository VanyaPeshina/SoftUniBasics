package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oneLev = Integer.parseInt(scanner.nextLine());
        int twoLeva = Integer.parseInt(scanner.nextLine());
        int fiveLeva = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= oneLev; i++) {
            for (int j = 0; j <= twoLeva; j++) {
                for (int k = 0; k <= fiveLeva; k++) {
                    int total = i + j * 2 + k * 5;
                    if (total == sum) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);
                    }
                }
            }
        }
    }
}