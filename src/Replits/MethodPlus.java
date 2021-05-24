package Replits;

import java.util.Scanner;

public class MethodPlus {
    public static void main(String[] args) {
        plus();
    }
    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        int fNum= scan.nextInt();
        System.out.println("please enter second number");
        int sNum=scan.nextInt();
        System.out.println("Result is: "+(fNum+sNum));
    }
}
