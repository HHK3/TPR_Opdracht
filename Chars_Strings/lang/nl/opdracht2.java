package Chars_Strings.lang.nl;

import java.util.Scanner;

public class opdracht2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character;

        System.out.println("Van welk karakter wil je de ASCII waarde weten? ");
        character = scanner.next().charAt(0);

       if (Character.isDigit(character)) {
           System.out.println("De " + character + " is een cijfer");
       } else if (Character.isLetter(character)) {
           System.out.println("De " + character + " is een letter");
       } else {
           System.out.println("De " + character + " is geen letter en ook geen getal");
       }

    }
}

