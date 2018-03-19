package Methode.lang.nl;

public class opdracht3 {
    public static void main(String[] args) {
        int getal1 = (int) (Math.random() * 10);
        int getal2 = (int) (Math.random() * 10);
        int product = berekenProduct(getal1, getal2);
        System.out.println("Het product van " + getal1 + " en " + getal2 + " is " + product);
    }

    public static int berekenProduct(int getal1, int getal2) {
        int product = getal1 * getal2;
        return product;

    }
}
