package src.nested_loops_exercises;

import java.util.Scanner;

public class Ex03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")) {
            boolean isPrime = true;
            int a = Integer.parseInt(input);
            if (a < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    sumNonPrime += a;
                    break;
                }
            }
            if (isPrime) {
                sumPrime += a;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNonPrime);
    }
}