package Replits.Loops;

import java.util.Scanner;

public class countTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count=0;
        String str=scan.nextLine();


            for (int i = 0; i <=str.length()-3 ; i++) {
                if (str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
                    count++;
                }

            }System.out.println(count);

        }
}
