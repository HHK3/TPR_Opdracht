package Elementair.lang.nl;

import java.util.Scanner;

public class opdracht1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mijl;

        System.out.println("Typ het aantal mijlen: ");
        mijl = scanner.nextInt();

        double kilometers = mijl * 1.6;

        System.out.println(mijl + " mijlen is " + kilometers);
    }
}
