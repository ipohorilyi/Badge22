package Replits;

import java.util.Scanner;

public class CubeMethods {
    public static void main(String[] args) {
        cube();
    }
    public static void cube(){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int resultCube=n*n*n;
        System.out.println(resultCube);
        return;
    }
}
