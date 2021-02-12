package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_FilmPremier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String pack = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        switch (movie) {
            case "John Wick":
                if (pack.equals("Drink")) {
                    sum = 12 * tickets;
                } else if (pack.equals("Popcorn")) {
                    sum = 15 * tickets;
                } else if (pack.equals("Menu")) {
                    sum = 19 * tickets;
                } break;

            case "Star Wars":
                if (pack.equals("Drink") && tickets >= 4) {
                    sum = (18 * 0.7) * tickets;
                } else if (pack.equals("Popcorn") && tickets >= 4) {
                    sum = (25 * 0.7) * tickets;
                } else if (pack.equals("Menu") && tickets >= 4) {
                    sum = (30 * 0.7) * tickets;
                } else if (pack.equals("Drink") && tickets < 4) {
                    sum = 18 * tickets;
                } else if (pack.equals("Popcorn") && tickets < 4) {
                    sum = 25 * tickets;
                } else if (pack.equals("Menu") && tickets < 4) {
                    sum = 30 * tickets;
                } break;

            case "Jumanji":
                if (pack.equals("Drink") && tickets == 2) {
                    sum = (9 * 0.85) * tickets;
                } else if (pack.equals("Popcorn") && tickets == 2) {
                    sum = (11 * 0.85) * tickets;
                } else if (pack.equals("Menu") && tickets == 2) {
                    sum = (14 * 0.85) * tickets;
                } else if (pack.equals("Drink") && tickets != 2) {
                    sum = 9 * tickets;
                } else if (pack.equals("Popcorn") && tickets != 2) {
                    sum = 11 * tickets;
                } else if (pack.equals("Menu") && tickets != 2) {
                    sum = 14 * tickets;
                } break;
        }
        System.out.printf("Your bill is %.2f leva.", sum);
    }
}