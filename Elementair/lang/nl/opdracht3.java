package Elementair.lang.nl;

import java.util.Scanner;

public class opdracht3 {

    public static void main(String[] args) {
        Scanner bedrag = new Scanner(System.in);
        Scanner rentepercentage = new Scanner(System. in);
        double startbedrag;
        double renteprocent;

        System.out.println("Typ een getal tussen 10 en 100: ");
        startbedrag = bedrag.nextDouble();

        System.out.println("Typ het rentepercentage in: ");
        renteprocent = rentepercentage.nextDouble();

        double rente = (renteprocent / 100.0) * startbedrag;
        double totaalbedrag = startbedrag + rente;


        System.out.println("De rente is " + rente + "% en het totaalbedrag is " + totaalbedrag);
    }
}
