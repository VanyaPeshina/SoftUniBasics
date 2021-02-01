package com.soft.uni.fundamentals.lab;

import java.util.Scanner;

public class ArchitectureProjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How many projects do you have?");
        int projectsCount = Integer.parseInt(scanner.nextLine());

        int result = projectsCount * 3;

        System.out.println("The architect " + name + " will need " + result + " hours to complete " + projectsCount + " project/s." );


    }
}
