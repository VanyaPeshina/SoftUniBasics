package com.soft.uni.fundamentals.for_loop_more_exercises;

public class Ex09_Clock_2 {
    public static void main(String[] args) {

        for (int hour = 0; hour <= 23; hour++) {

            for (int minutes = 0; minutes <= 59; minutes++) {

                System.out.printf("%d : %d\n", hour, minutes);
            }
        }
    }
}