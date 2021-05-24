package Replits.Arrays;

import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];
        System.out.println(Integer.toBinaryString(decimal));

    }
}
