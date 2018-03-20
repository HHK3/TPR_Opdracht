package Arrays.lang.nl;

import java.util.Scanner;

public class opdracht2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[] = new int[9];

        System.out.println("Geef me 9 intengers (gebruik een spatie na elke intenger): ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int temp;

        int start = 0;
        int end = arr.length - 1;

        //Logic to reverse an array
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Daar komen ze, in omgekeerde volgorde: ");

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }

    }

}