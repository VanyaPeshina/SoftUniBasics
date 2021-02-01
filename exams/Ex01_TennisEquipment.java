package com.soft.uni.fundamentals.exams;

import java.util.Scanner;

public class Ex01_TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRPrice = Double.parseDouble(scanner.nextLine());
        int tennisR = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double sneakersPrice = tennisRPrice / 6;
        double sum = (tennisR * tennisRPrice) + (sneakers * sneakersPrice);
        double outfit = sum * 0.2;

        double sumDjokovic = Math.floor((sum + outfit) * 0.125);
        double sumSponsors = Math.ceil((sum + outfit) * 0.875);

        System.out.printf("Price to be paid by Djokovic %.0f\n", sumDjokovic);
        System.out.printf("Price to be paid by sponsors %.0f", sumSponsors);
    }
}