package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int i = 0; i <5 ; i++) {
            System.out.println(words[i].substring(0,2));

        }
    }
}
