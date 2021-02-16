package src.nested_loops_lab;

import java.util.Scanner;

public class Ex07_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterAllTickets = 0;
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;

        String input;
        while (!"Finish".equals(input = scanner.nextLine())) {
            int freeSpaces = Integer.parseInt(scanner.nextLine());
            int counterTickets = 0;

            String type;
            while (counterTickets < freeSpaces && !"End".equals(type = scanner.nextLine())) {
                if (type.equals("student")) {
                    counterStudent++;
                    counterTickets++;
                    counterAllTickets++;
                } else if (type.equals("standard")) {
                    counterStandard++;
                    counterTickets++;
                    counterAllTickets++;
                } else if (type.equals("kid")) {
                    counterKid++;
                    counterTickets++;
                    counterAllTickets++;
                }
            }
            double percent = counterTickets * 100.0 / freeSpaces;
            System.out.printf("%s - %.2f%% full.%n", input, percent);
        }
        double percentStudents = counterStudent * 100.0 / counterAllTickets;
        double percentStandard = counterStandard * 100.0 / counterAllTickets;
        double percentKids = counterKid * 100.0 / counterAllTickets;

        System.out.printf("Total tickets: %d%n", counterAllTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudents);
        System.out.printf("%.2f%% standard tickets.%n", percentStandard);
        System.out.printf("%.2f%% kids tickets.", percentKids);
    }
}
