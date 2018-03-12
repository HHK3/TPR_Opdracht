package Selections.lang.nl;

import java.util.Scanner;

public class opdracht5 {
    public static void main(String[] args) {

        Scanner gewicht1 = new Scanner(System.in);
        Scanner lengte1 = new Scanner(System.in);
        double gewicht;
        double lengte;

        System.out.println("Wat is uw gewicht (kg) ?");
        gewicht = gewicht1.nextDouble();

        System.out.println("Wat is uw lengte (m) ?");
        lengte = lengte1.nextDouble();

        double bmi = gewicht / (lengte * lengte);

        if (bmi < 18.5) {
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent, betekent dit dat u ondergewicht hebt.");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent, betekent dit dat u een normaal gewicht hebt.");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent, betekent dit dat u overgewicht hebt.");
        } else if (bmi >= 30.0) {
            System.out.println("Uw BMI is " + bmi);
            System.out.println("Als u minstens 20 jaar bent, betekent dit dat u zwaar overgewicht hebt.");
        }
    }
}