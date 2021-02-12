package com.soft.uni.fundamentals.for_loop_more_exercises;

import java.util.Scanner;

public class Ex02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;
        int treatedPat = 0;
        int untreatedPat = 0;

        for (int i = 1; i <= days; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (untreatedPat > treatedPat) {
                    doctors++;
                }
            } if (patients <= doctors) {
                treatedPat += patients;
            } else {
                treatedPat += doctors;
                untreatedPat += (patients - doctors);
            }
        }
        System.out.printf("Treated patients: %d.\n",treatedPat);
        System.out.printf("Untreated patients: %d.",untreatedPat);
    }
}