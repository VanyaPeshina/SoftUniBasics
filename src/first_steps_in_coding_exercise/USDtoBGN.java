package com.soft.uni.fundamentals.first_steps_in_coding_exercise;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double USD = Double.parseDouble(scan.nextLine());
        double BGN = USD * 1.79549;

        System.out.println(BGN);

    }
}
