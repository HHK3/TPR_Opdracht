package Selections.lang.nl;

import java.util.Scanner;

public class opdracht2 {
    public static void main(String[] args) {

        int randomm = (int) (Math.random() * 9 + 1);
        int randomm1 = (int) (Math.random() * 9 + 1);
        int randomm2 = (int) (Math.random() * 9 + 1);
        int oplossing = randomm * randomm1 * randomm2;
        int getal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel is " + randomm + " x " + randomm1 + " x " + randomm2 + " ? ");
        getal = scanner.nextInt();

        if(getal == oplossing){
            System.out.println("Dat is goed!");
        } else {
            System.out.println("Helaas, niet goed.");
        }

    }
}