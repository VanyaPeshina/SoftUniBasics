package src.pre_exam2;

import java.util.Scanner;

public class Ex03_CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        double months = 0;
        String breed = scanner.nextLine();
        String gender = scanner.nextLine();

        if (breed.equals("British Shorthair")) {
            if (gender.equals("m")) {
                age = 13;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 14;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (breed.equals("Siamese")) {
            if (gender.equals("m")) {
                age = 15;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 16;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (breed.equals("Persian")) {
            if (gender.equals("m")) {
                age = 14;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 15;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (breed.equals("Ragdoll")) {
            if (gender.equals("m")) {
                age = 16;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 17;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (breed.equals("American Shorthair")) {
            if (gender.equals("m")) {
                age = 12;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 13;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (breed.equals("Siberian")) {
            if (gender.equals("m")) {
                age = 11;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            if (gender.equals("f")) {
                age = 12;
                months = age * 12;
                months = Math.floor(months / 6);
            }
            System.out.printf("%.0f cat months", months);
        }
        if (!breed.equals("British Shorthair")
                && !breed.equals("Siamese")
                && !breed.equals("Persian")
                && !breed.equals("Ragdoll")
                && !breed.equals("American Shorthair")
                && !breed.equals("Siberian")) {
            System.out.printf("%s is invalid cat!", breed);
        }
    }
}