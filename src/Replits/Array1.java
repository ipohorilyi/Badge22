package Replits;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<2;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!

        for (int i =0; i <2 ; i++) {
            System.out.print(arr[i].charAt(0));
            System.out.print(arr[i].charAt(arr[i].length()-1));
            System.out.println();
        }




    }
}
