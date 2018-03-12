package Elementair.lang.nl;

import java.util.Scanner;

public class opdracht2 {

    public static void main(String[] args) {
        Scanner leeftijd = new Scanner(System.in);
        Scanner maanden = new Scanner(System. in);
        int jaar;
        int maand;

        System.out.println("Hoeveel jaar oud ben je? ");
        jaar = leeftijd.nextInt();

        System.out.println("Hoeveel maanden komen daar nog bij? ");
        maand = maanden.nextInt();

        double maandjaar = (maand / 12.0) + jaar;
        double minuten = maandjaar * 365 * 24 * 60;

        System.out.println("Dan ben je nu ongeveer " + minuten + " minuten oud.");
    }
}