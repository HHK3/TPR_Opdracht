package Selections.lang.nl;

import java.util.Scanner;

public class opdracht4 {
    public static void main(String[] args) {
        String today;
        String futureday;

        Scanner input = new Scanner(System.in);

        System.out.print("Vul de dag van vandaag in (0 = zo / 1 = ma / 2 = di / 3 = wo / 4 = do / 5 = vrij / 6 = za): ");
        int day = input.nextInt();
        System.out.print("En van hoeveel dagen in de toekomst wil je de weekdag berekenen? ");
        int numDays = input.nextInt();

        if (day == 0) {
            today = "zondag";
        } else if (day == 1) {
            today = "maandag";
        } else if (day == 2) {
            today = "dinsdag";
        } else if (day == 3) {
            today = "woensdag";
        } else if (day == 4) {
            today = "donderdag";
        } else if (day == 5) {
            today = "vrijdag";
        } else {
            today = "zaterdag";
        }
        int calcFutureday = (day + numDays) % 7;

        if (calcFutureday == 0) {
            futureday = "zondag";
        } else if (calcFutureday == 1) {
            futureday = "maandag";
        } else if (calcFutureday == 2) {
            futureday = "dinsdag";
        } else if (calcFutureday == 3) {
            futureday = "woensdag";
        } else if (calcFutureday == 4) {
            futureday = "donderdag";
        } else if (calcFutureday == 5) {
            futureday = "vrijdag";
        } else {
            futureday = "zaterdag";
        }

        System.out.println("Vandaag is het " + today + " en over " + numDays + " dag(en) is het " +
                futureday);
    }
}