package com.soft.uni.fundamentals.while_loop_exercises;

import java.util.Scanner;

public class Ex06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int sizeSqCm = width * length;
        int counter = 0;
        String piecesTaken = "";

        while (counter < sizeSqCm) {
            piecesTaken = scanner.nextLine();
            if (piecesTaken.equals("STOP")) {
                break;
            }
            counter += Integer.parseInt(piecesTaken);
        }
        int piecesNeeded = Math.abs(counter - sizeSqCm);
        if (piecesTaken.equals("STOP")) {
            System.out.printf("%d pieces are left.", piecesNeeded);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", piecesNeeded);
        }
    }
}