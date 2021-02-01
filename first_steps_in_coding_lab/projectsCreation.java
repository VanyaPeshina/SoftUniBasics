package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class projectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());
        int result = projectsCount * 3;

        System.out.println("The architect " + name + " will need " + result + " hours to complete " + projectsCount + " project/s." );

    }
}