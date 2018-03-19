package Loops.lang.nl;

import java.util.Scanner;

public class opdracht4 {
    public static void main(String[] args) {
        int smallest = 0;
        int large = 0;
        int num;
        System.out.println("Voer 5 nummers in");//how many number you want to enter
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        smallest = num;
        for (int i = 0; i <= 3; i++) {
            num = input.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Het kleinste getal is: " + smallest);
    }
}