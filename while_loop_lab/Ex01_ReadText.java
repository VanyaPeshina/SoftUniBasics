package com.soft.uni.fundamentals.while_loop_lab;

import java.util.Scanner;

public class Ex01_ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}