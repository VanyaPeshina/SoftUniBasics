package com.soft.uni.fundamentals.while_loop_excersice;

import java.util.Scanner;

public class Ex01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        String book = scanner.nextLine();

        int booksCount = 0;

        while (!book.equals(favouriteBook)) {
            if (book.equals("No More Books")) {
                break;
            }
            booksCount++;
            book = scanner.nextLine();
        }
        if (book.equals(favouriteBook)) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", booksCount);
        }
    }
}