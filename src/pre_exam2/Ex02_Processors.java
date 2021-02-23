package src.pre_exam2;

import java.util.Scanner;

public class Ex02_Processors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processors = Integer.parseInt(scanner.nextLine());
        int staff = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        double hours = staff * workingDays * 8;
        double allProcessors = Math.floor(hours / 3);

        double losses = Math.abs(allProcessors - processors);
        double lossesSum = losses * 110.1;

        if (allProcessors < processors) {
            System.out.printf("Losses: -> %.2f BGN", lossesSum);
        } else {
            System.out.printf("Profit: -> %.2f BGN", lossesSum);
        }
    }
}