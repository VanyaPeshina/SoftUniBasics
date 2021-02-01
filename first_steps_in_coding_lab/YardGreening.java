package com.soft.uni.fundamentals.first_steps_in_coding_lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clientsOrder = Integer.parseInt(scanner.nextLine());

        double orderPrice = clientsOrder * 7.61;

        double finalPrice = orderPrice - 0.18 * orderPrice;
        double discount = 0.18 * orderPrice;

        System.out.printf("The final price is: %.2f lv. \n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
