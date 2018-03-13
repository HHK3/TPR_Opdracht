package Chars_Strings.lang.nl;

import java.util.Scanner;

public class opdracht7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String land1 = new String();
        String land2 = new String();
        String land3 = new String();

        System.out.println("Land 1: ");
        land1 = scanner.next();

        System.out.println("Land 2: ");
        land2 = scanner.next();

        System.out.println("Land 3: ");
        land3 = scanner.next();

        boolean swapped = false;
        do {
            swapped = false;
            if (land2.compareTo(land1) < 0) {
                String tmp = land2;
                land2 = land1;
                land1 = tmp;
                swapped = true;
            }
            if (land3.compareTo(land2) < 0) {
                String tmp = land3;
                land3 = land2;
                land2 = tmp;
                swapped = true;
            }
        } while (swapped);

        System.out.println(land1 + " - " + land2 + " - " + land3);

    }
}
