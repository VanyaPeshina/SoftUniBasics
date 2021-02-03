package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex04_EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        String command = "";
        String output = "";
        int eggsMovement;
        int eggsSold = 0;
        int eggsInStore = eggs;

        for (int i = 1; i <= 2; i++) {
            command = scanner.nextLine();
            eggsMovement = Integer.parseInt(scanner.nextLine());

            if (command.equals("Close")) {
                output = "Store is closed!";
                break;
            } else if (command.equals("Buy")) {
                eggsInStore -= eggsMovement;
                eggsSold += eggsMovement;
                output = "Not enough eggs in store!";
                if (eggsMovement > eggsInStore) {
                    break;
                }
            } else if (command.equals("Fill")) {
                eggsInStore += eggsMovement;
                output = "Not enough eggs in store!";
            }
        }
        int eggsLeft = eggs - eggsSold;
        System.out.println(command);
        //if (command.equals("Buy") || command.equals("Fill")) {
          //  System.out.printf("You can buy only %d.", eggsLeft);
        if (output.equals("Close")) {
            System.out.printf("%d eggs sold.", eggsSold);

            //НЕ Е РЕШЕНА
        }
    }
}