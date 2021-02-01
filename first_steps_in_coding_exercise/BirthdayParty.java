package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double cake = rent * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;

        double sum = rent + cake + drinks + animator;
        System.out.println(sum);
    }
}
