package Arrays.lang.nl;

import java.util.*;

public class opdracht3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double arr[] =  new double[10];
        int above = 0;
        double average;
        double n, sum = 0.0;
        System.out.println("Geef me 10 doubles, dan bereken ik het gemiddelde en tel ik hoeveel cijfers hoger zijn \n(gebruik een spatie na elke intenger): ");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
            sum = sum + arr[i];

        }
        average = sum / 10;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                above++;
            }
        }
        System.out.println("Het gemiddelde is " + average);
        System.out.println("Het aantal doubles boven het gemiddelde is: " + above);




    }

}