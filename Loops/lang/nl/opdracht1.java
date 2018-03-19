package Loops.lang.nl;

import java.util.Scanner;

public class opdracht1 {
    public static void main(String[] args) {
        boolean cijfer = false;
        Scanner scanner = new Scanner(System.in);
        double answer;

        while (cijfer == false) {
            System.out.println("*****************");
            System.out.println("Wat is je toetscijfer? ");
            answer = scanner.nextDouble();
            if (answer == -1) {
                System.out.println("Tot ziens!");
                cijfer = true;
            } else if (answer >= 5.5) {
                System.out.println("Nice, je hebt een voldoende!");
            } else if (answer <= 5.4 ) {
                System.out.println("Helaas, je hebt een onvoldoende");
            }
        }
    }
}
