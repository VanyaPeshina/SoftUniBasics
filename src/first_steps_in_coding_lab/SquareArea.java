package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int a = Integer.parseInt(input);

        System.out.println(a * a);
    }
}
