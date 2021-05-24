package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class frontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE
        int[] newArr = new int[2];
        if (size>1){
            //newArr=nums;
            System.out.println(Arrays.toString(newArr));
        }
        else{
            System.out.println(num[0]);
        }

    }
}
