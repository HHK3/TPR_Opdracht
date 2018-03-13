package Chars_Strings.lang.nl;


public class opdracht5 {
    public static void main(String[ ] arg) {

        int ascii = (int)(Math.random() * 26) + 97;
        char c = (char) ascii;

        System.out.println("Uw willekeurige letter is de '" + c + "'");
    }
}
