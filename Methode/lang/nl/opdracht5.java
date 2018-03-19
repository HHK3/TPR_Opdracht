package Methode.lang.nl;

import java.util.Scanner;

public class opdracht5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dagnummer;

        System.out.println("Van welk getal wil je de weekdag weten? (Kies van 1 t/m 7)");
        dagnummer = scanner.nextInt();

        String str1;
        str1 = bepaalDag(dagnummer);

        System.out.println("Bij nummer " + dagnummer + " hoort de weekdag " + str1);


    }

    public static String bepaalDag(int dagnummer) {
        String dag;
        if (dagnummer == 1) {
            dag = "maandag";
        } else if (dagnummer == 2) {
            dag = "dinsdag";
        } else if (dagnummer == 3) {
            dag = "woensdag";
        } else if (dagnummer == 4) {
            dag = "donderdag";
        } else if (dagnummer == 5) {
            dag = "vrijdag";
        } else if (dagnummer == 6) {
            dag = "zaterdag";
        } else if (dagnummer == 7) {
            dag = "zondag";
        } else {
            dag = "N.V.T.";
        }
        return dag;
    }

}
