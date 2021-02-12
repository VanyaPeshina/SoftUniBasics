package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double action = Double.parseDouble(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        double sceneLength = Double.parseDouble(scanner.nextLine());

        double preparation = action * 0.15;
        double movie = scenes * sceneLength;
        double time = action - preparation;
        double timeLeft = Math.round(time - movie);
        double timeNeeded = Math.round(movie - time);

        if (time >= movie) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeLeft);
        } else if (time < movie) {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", timeNeeded);
        }
    }
}