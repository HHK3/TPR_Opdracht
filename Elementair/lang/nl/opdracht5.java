package Elementair.lang.nl;

import java.util.Scanner;

public class opdracht5 {

    public static void main(String[] args) {
        Scanner getallen = new Scanner(System.in);

        int getal;

        System.out.println("Typ een getal tussen 0 en 1000: ");
        getal = getallen.nextInt();

        int restGetal = getal % 10;
        int anderGetal = getal / 10;
        int anderGetal1 = anderGetal % 10;
        int anderGetal2 = anderGetal / 10;
        int geheel = anderGetal2 * anderGetal1 * restGetal;

        System.out.println("De vermenigvuldiging van de cijfers luidt: " + anderGetal2 + " x " + anderGetal1 + " x " + restGetal + " = " + geheel);
    }
}