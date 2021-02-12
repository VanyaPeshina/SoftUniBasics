package com.soft.uni.fundamentals.exercise;

import java.util.Scanner;

public class DepositCalculatorZornitsa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit=Double.parseDouble(scanner.nextLine());
        int monthDeposit=Integer.parseInt(scanner.nextLine());
        double yearInterest=Double.parseDouble(scanner.nextLine());


        double interest=deposit*yearInterest/100;
        double accruedInterest= interest / 12;



        double sum=deposit+monthDeposit*accruedInterest;


        System.out.println(sum);
    }
}
