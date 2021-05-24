package Replits.Methods;

import java.util.Scanner;

public class fibonachy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int result = 0;
        for (int i = 1; i <=num ; i++) {
            result=result+i;
        }
        System.out.println(result);






    }
}
