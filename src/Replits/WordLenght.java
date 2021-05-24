package Replits;

import java.util.Scanner;

public class WordLenght {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text=scan.nextLine();
                int lenght=text.length() ;

        System.out.println(lenght);

    }
}
