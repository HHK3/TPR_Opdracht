package Loops.lang.nl;

public class opdracht7 {
    public static void main(String[] args) {
        boolean lol = true;
        int counter = 0;
        while (lol) {
            int s = counter * counter;
            if (s < 1000) {
                System.out.println("\nHet getal is " + counter);
                System.out.println("Het kwadraat van " + counter + " is " + s);
                counter++;
            } else {
                lol = false;
            }
        }
    }
}
