package Replits.Arrays;

import java.util.Scanner;

public class absoluteDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;
        int summatrix1=matrix[0][0]+matrix[1][1]+matrix[2][2];
        int summatrix2=matrix[2][0]+matrix[1][1]+matrix[0][2];
        result=summatrix1-summatrix2;

        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}


