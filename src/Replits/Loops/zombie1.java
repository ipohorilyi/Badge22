package Replits.Loops;

import java.util.Scanner;

public class zombie1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

       int day=0;
        do {

            System.out.println("Day "+day+" ["+inhabitants+"]");
            if (inhabitants==0){
                break;
            }
            inhabitants=inhabitants/2;
            ++day;
        }while (inhabitants>0);
        System.out.println("---- EXTINCT ----");
    }
}
