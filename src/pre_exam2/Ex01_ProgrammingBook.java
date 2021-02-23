package src.pre_exam2;

import java.util.Scanner;

public class Ex01_ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double page = Double.parseDouble(scanner.nextLine());
        double bookCover = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double designerPrice = Double.parseDouble(scanner.nextLine());
        int ownParticipation = Integer.parseInt(scanner.nextLine());

        double firstSum = (page * 899) + (bookCover * 2);
        double reduction = firstSum - (firstSum * discount / 100);
        double finalPrice = reduction + designerPrice;
        double total = finalPrice - (finalPrice * ownParticipation / 100);

        System.out.printf("Avtonom should pay %.02f BGN.",total);
    }
}