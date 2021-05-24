package Replits.Loops;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String anser;
        String guest="";
        do {
            System.out.println("Please enter guest name:");
            String fName = scan.nextLine();
            guest+=fName;
            System.out.println("Do you want to enter new guest name:");
            anser=scan.nextLine();
            if (anser.equals("yes")){
                guest+=", ";
            }
            if (anser.equals("no")){
                break;
            }

        }while (anser.equals("yes"));
        System.out.println("Guest's list: "+guest);


    }
}
