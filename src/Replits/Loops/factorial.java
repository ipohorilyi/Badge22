package Replits.Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result=0;
        int i=1;
        do {
            i=i*n;
            --n;
        }while (n>=1);
        System.out.println(i);


    }
}
// re