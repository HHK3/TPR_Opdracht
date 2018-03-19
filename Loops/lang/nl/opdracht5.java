package Loops.lang.nl;

import java.util.Scanner;


public class opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hoog = 0;
        String student = "onbekend";

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hoe heet de " + i + "e student?");
            String naam = scanner.nextLine();
            System.out.println("Wat was zijn of haar cijfer? ");
            double cijfer = scanner.nextDouble();
            scanner.nextLine();

            if (i == 0) {
                hoog = cijfer;
                student = naam;
            } else {
                if (cijfer > hoog) {
                    hoog = cijfer;
                    student = naam;
                }
            }
        }
        System.out.println("Hoogste cijfer is van " + student + ".");
        System.out.println("Hij/zij heeft een " + hoog);
    }
}
