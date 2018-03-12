package Selections.lang.nl;

import java.util.Scanner;

public class opdracht6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[] arr= new int [3];
        for(int b=0;b<arr.length;b++){
            System.out.print("Getal " + (b+1) +": ");
            arr[b]=input.nextInt();
        }

        for (int i=0; i<arr.length;i++) {
            for (int k=i;k<arr.length;k++) {

                if(arr[i] > arr[k]) {

                    int temp=arr[k];
                    arr[k]=arr[i];
                    arr[i]=temp;
                }
            }

        }
        System.out.println("******************\n Van klein naar groot:");


        for (int i : arr){
            System.out.println(i);
        }
    }
}