package Elementair.lang.nl;

import java.util.Scanner;

public class opdracht4 {

    public static void main(String[] args) {
        Scanner getall = new Scanner(System.in);

        int getal;

        System.out.println("Typ een getal tussen 10 en 100: ");
        getal = getall.nextInt();

        int getal1 = getal - 2;
        int getal2 = getal - 1;
        int getal3 = getal + 1;
        int getal4 = getal + 2;

        System.out.println("De vijf getallen zijn " + getal1 + " - " + getal2 + " - " + getal + " - " + getal3 + " - " + getal4);
    }
}