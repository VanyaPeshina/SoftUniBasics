package com.soft.uni.fundamentals.for_loop_exercise;

import java.util.Scanner;

public class Ex06_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int fb = 150;
        int ig = 100;
        int reddit = 50;

        for (int i = 1; i <= n; i++) {
            String tab = scanner.nextLine();
            if (tab.equals("Facebook")){
                salary -= fb;
            } else if (tab.equals("Instagram")) {
                salary -= ig;
            } else if (tab.equals("Reddit")) {
                salary -= reddit;
            } else {
                salary += 0;
            }
            if (salary == 0) {
                break;
            }
        } if (salary == 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}

