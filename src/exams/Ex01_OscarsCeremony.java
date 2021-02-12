package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double statues = rent - (rent * 0.3);
        double catering = statues - (statues * 0.15);
        double sound = catering / 2;

        double sum = rent + statues + catering + sound;

        System.out.printf("%.2f", sum);
    }
}