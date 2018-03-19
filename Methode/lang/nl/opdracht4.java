package Methode.lang.nl;

import java.util.Scanner;

public class opdracht4 {
    public static void main(String[] args) {
        int getal1;
        int getal2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is het eerste getal?");
        getal1 = scanner.nextInt();

        System.out.println("Wat is het tweede getal?");
        getal2 = scanner.nextInt();

        int product = berekenProduct(getal1, getal2);

        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product);
    }

    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 * getal2;
        return product;

    }
}
