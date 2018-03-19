package Methode.lang.nl;

import java.util.Scanner;

public class opdracht7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int getal;

        System.out.println("Van welk getal wil je weten of het een even getal is?");
        getal = scanner.nextInt();

        isPriemGetal(getal);
    }

    public static Boolean isPriemGetal(int getal) {
        if (getal > 2 && getal % 2 == 0 || getal == 1) {
            System.out.println("Het getal " + getal + " is geen priemgetal");
            return false;

        }

        for (int i = 3; i <= (int) Math.sqrt(getal); i += 2) {
            if (getal % i == 0) {
                System.out.println("Het getal " + getal + " is geen priemgetal");
                return false;
            }
        }
        System.out.println("Het getal " + getal + " is een priemgetal");
        return true;
    }
}