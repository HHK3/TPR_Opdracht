package Chars_Strings.lang.nl;

import java.util.Scanner;
import java.lang.*;
import java.lang.String;

public class opdracht6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = new String();

        System.out.println("Typ een string in: ");
        string = scanner.nextLine();
        char c1 = string.charAt(0);
        char c2 = string.charAt(string.length() - 1);

        System.out.println("De lengte van de String is " + string.length());
        System.out.println("De eerste karakter is " + c1);
        System.out.println("De laatste karakter is " + c2);
    }

}
