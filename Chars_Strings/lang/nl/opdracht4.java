package Chars_Strings.lang.nl;

import java.util.Scanner;

public class opdracht4 {
    public static void main(String[ ] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Van welke letter wil je het nummer weten? ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'b'|| ch == 'c'){
            System.out.println("De letter " + ch + " staat op de 2-toets");
        } else if (ch == 'd' || ch == 'e'|| ch == 'f'){
            System.out.println("De letter " + ch + " staat op de 3-toets");
        } else if (ch == 'g' || ch == 'h'|| ch == 'i'){
            System.out.println("De letter " + ch + " staat op de 4-toets");
        } else if (ch == 'j' || ch == 'k'|| ch == 'l'){
            System.out.println("De letter " + ch + " staat op de 5-toets");
        } else if (ch == 'm' || ch == 'n'|| ch == 'o'){
            System.out.println("De letter " + ch + " staat op de 6-toets");
        } else if (ch == 'p' || ch == 'q'|| ch == 'r' || ch == 's'){
            System.out.println("De letter " + ch + " staat op de 7-toets");
        } else if (ch == 't' || ch == 'u'|| ch == 'v'){
            System.out.println("De letter " + ch + " staat op de 8-toets");
        } else if (ch == 'w' || ch == 'x'|| ch == 'y' || ch == 'z'){
            System.out.println("De letter " + ch + " staat op de 9-toets");
        }
    }
}

