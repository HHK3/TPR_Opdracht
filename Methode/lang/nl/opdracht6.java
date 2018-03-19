package Methode.lang.nl;

import java.util.Scanner;

public class opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal;

        System.out.println("Van welk getal wil je weten of het een even getal is?");
        getal = scanner.nextInt();

        isEvenGetal(getal);
    }

    public static Boolean isEvenGetal(int getal) {
        Boolean evenOfNiet;

        if (getal % 2 == 0) {
            evenOfNiet = true;
            System.out.println("Het getal " + getal + " is een even getal");
        } else {
            evenOfNiet = false;
            System.out.println("Het getal " + getal + " is geen even getal");
        }
        return evenOfNiet;
    }
}
