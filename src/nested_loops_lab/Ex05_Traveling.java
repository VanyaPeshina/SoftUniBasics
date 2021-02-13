package src.nested_loops_lab;

import java.util.Scanner;

public class Ex05_Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        double savings = 0;

        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            while (savings < budget) {
                savings += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            savings = 0;
            destination = scanner.nextLine();
        }
    }
}