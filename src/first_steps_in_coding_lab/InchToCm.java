package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class InchToCm {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double inch = Double.parseDouble(input);

        double result = inch * 2.54;
                System.out.println(result);

    }
}
