package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
    }
}
