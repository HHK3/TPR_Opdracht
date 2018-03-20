package Arrays.lang.nl;

public class opdracht1 {
    public static void main(String[] args) {
        int[] dobbelsteen = new int[100];
        int i, count = 0;

        System.out.println("Hier komen 100 worpen met een dobbelsteen: \n*****************************" );
        for (i = 0; i < dobbelsteen.length; i++) {
            dobbelsteen[i] = (int) (Math.random() * 6) + 1;
            System.out.print(dobbelsteen[i] + " ");
            count++;

            if (count == 10) {
                System.out.print("\n");
                count = 0;
            }
        }
    }
}
