package Selections. lang. nl;

import java.util.Scanner;

public class opdracht1 {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 9 + 1);
        int random1 = (int) (Math.random() * 9 + 1);
        int oplossing = random + random1;
        int getal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoeveel is " + random + " + " + random1 + " ? ");
        getal = scanner.nextInt();

        if(getal == oplossing){
            System.out.println("Dat is goed!");
        } else {
            System.out.println("Helaas, niet goed.");
        }

    }
}