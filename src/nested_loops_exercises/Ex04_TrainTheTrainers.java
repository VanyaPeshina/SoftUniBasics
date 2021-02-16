package src.nested_loops_exercises;

import java.util.Scanner;

public class Ex04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        double grades = 0;
        int counterGrades = 0;

        while (true) {
            String presentationName = scanner.nextLine();
            double sumGrade = 0;

            if (presentationName.equals("Finish")) {
                double totalAverage = grades / counterGrades;
                System.out.printf("Student's final assessment is %.2f.", totalAverage);
                break;
            }
            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumGrade += grade;
                grades += grade;
                counterGrades++;
            }
            double averageGrade = sumGrade / jury;
            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
        }
    }
}