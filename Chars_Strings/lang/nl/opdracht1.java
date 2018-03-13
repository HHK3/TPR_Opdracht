package Chars_Strings.lang.nl;

import java.util.Scanner;

public class opdracht1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character;

        System.out.println("Van welk karakter wil je de ASCII waarde weten? ");
        character = scanner.next().charAt(0);
        int ascii = (int) character;

        System.out.println("De ASCII waarde van het karakter " + character + " is " + ascii);

    }
}
