package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String hall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        if (movie.equals("A Star Is Born")) {
            if (hall.equals("normal")) {
                sum = tickets * 7.50;
            } else if (hall.equals("luxury")) {
                sum = tickets * 10.50;
            } else if (hall.equals("ultra luxury")) {
                sum = tickets * 13.50;
            }
        }else if (movie.equals("Bohemian Rhapsody")) {
            if (hall.equals("normal")) {
                sum = tickets * 7.35;
            } else if (hall.equals("luxury")) {
                sum = tickets * 9.45;
            } else if (hall.equals("ultra luxury")) {
                sum = tickets * 12.75;
            }
        }else if (movie.equals("Green Book")) {
            if (hall.equals("normal")) {
                sum = tickets * 8.15;
            } else if (hall.equals("luxury")) {
                sum = tickets * 10.25;
            } else if (hall.equals("ultra luxury")) {
                sum = tickets * 13.25;
            }
        }else if (movie.equals("The Favourite")) {
            if (hall.equals("normal")) {
                sum = tickets * 8.75;
            }else if (hall.equals("luxury")) {
                sum = tickets * 11.55;
            }else if (hall.equals("ultra luxury")) {
                sum = tickets * 13.95;
            }
        } System.out.printf("%s -> %.2f lv.", movie, sum);
    }
}
