package src.nested_loops_more_exercises;

import java.util.Scanner;

public class Ex05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int i = 1; i <= men; i++) {
            for (int j = 1; j <= women; j++) {
                counter++;
                if (counter <= tables) {
                    System.out.printf("(%d <-> %d) ", i, j);
                }
            }
        }
    }
}