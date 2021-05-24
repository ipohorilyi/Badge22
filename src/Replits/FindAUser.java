package Replits;

import java.util.Scanner;

public class FindAUser {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //WRITE YOUR CODE HERE
            String user1="Max Payne";
            String user2="Alan Wake";
            System.out.println("Enter full name:");
            String userTyped=scan.nextLine();
            if( userTyped.equalsIgnoreCase(user1)||userTyped.equalsIgnoreCase(user2)){
                System.out.println("User found!");
            }else
            {
                System.out.println("User not found!");
            }





        }
    }

