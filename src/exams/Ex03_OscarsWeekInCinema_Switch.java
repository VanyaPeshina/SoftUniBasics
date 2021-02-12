package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_OscarsWeekInCinema_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (movie.equals("A Star Is Born")) {
            switch (hall) {
            case "normal" -> sum = tickets * 7.50;
            case "luxury" -> sum = tickets * 10.50;
            case "ultra luxury" -> sum = tickets * 13.50;
            }
        }else if (movie.equals("Bohemian Rhapsody")) {
            switch (hall) {
            case "normal" -> sum = tickets * 7.35;
            case "luxury" -> sum = tickets * 9.45;
            case "ultra luxury" -> sum = tickets * 12.75;
            }
        }else if (movie.equals("Green Book")) {
            switch (hall) {
            case "normal" -> sum = tickets * 8.15;
            case "luxury" -> sum = tickets * 10.25;
            case "ultra luxury" -> sum = tickets * 13.25;
            }
        }else if (movie.equals("The Favourite")) {
            switch (hall) {
            case "normal" -> sum = tickets * 8.75;
            case "luxury" -> sum = tickets * 11.55;
            case "ultra luxury" -> sum = tickets * 13.95;
            }
        } System.out.printf("%s -> %.2f lv.", movie, sum);
    }
}