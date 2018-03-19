package Methode.lang.nl;

import java.util.Scanner;

public class opdracht2 {
    public static void main(String[] args) {
        String zinnetje;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welk zinnetje moet ik printen?");
        zinnetje = scanner.nextLine();
        printZinnetje(zinnetje);
    }

    public static void printZinnetje(String zinnetje) {
        System.out.println(zinnetje);
    }
}
