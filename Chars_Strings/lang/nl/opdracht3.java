package Chars_Strings.lang.nl;

import java.util.Scanner;

public class opdracht3 {
    public static void main(String[] arg) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Van welke letter wil je weten of het een klinker is? ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                i++;
        }
        if (i == 1)
            System.out.println("De " + ch + " een klinker");
        else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println("De " + ch + " is een medeklinker");
        else
            System.out.println("Behoort niet bij het alfabet.");
    }
}

