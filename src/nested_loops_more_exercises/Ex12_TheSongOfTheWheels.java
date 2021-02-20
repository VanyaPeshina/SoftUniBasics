package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex12_TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        String number = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {

                        if (a * b + c * d == M) {
                            if (a < b && c > d) {
                                System.out.printf("%d%d%d%d ", a, b, c, d);
                                counter++;
                                if (counter == 4) {
                                    number = String.format("%d%d%d%d", a, b, c, d);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (counter >= 4) {
            System.out.printf("%nPassword: %s", number);
        } else {
            System.out.printf("%nNo!");
        }
    }
}