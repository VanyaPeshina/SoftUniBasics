package com.soft.uni.fundamentals.conditional_statements_exercise;

import java.util.Scanner;
public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int hour = h;
        int minutes = min + 15;

        if (minutes > 59) {
            hour++;
            minutes -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        if (minutes < 10) {
            System.out.println(hour + ":0" + minutes);
        } else {
            System.out.println(hour + ":" + minutes);
        }
    }
}
