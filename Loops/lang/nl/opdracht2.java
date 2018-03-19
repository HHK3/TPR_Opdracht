package Loops.lang.nl;

import java.util.Random;

public class opdracht2 {
    public static void main(String[] args) {
        Random r = new Random();
        int nummer = 0;

        for (int i = 0; i < 10; i++) {
           int randomint = r.nextInt(50);
           System.out.println("Nummer " + randomint);
           nummer = nummer + randomint;
        }
        System.out.println("*******************");
        System.out.println("Som van alle nummers = " + nummer);
    }
}
