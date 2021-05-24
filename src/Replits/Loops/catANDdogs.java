package Replits.Loops;

import java.util.Scanner;

public class catANDdogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        int i=0;
        int j=3;

        if (word.length()<3) {
            System.out.println(true);
        }else {

            do {

                if (word.substring(i, j).contains("cat")) {
                    ++countOfCats;
                } else if (word.substring(i, j).contains("dog")) {
                    ++countOfDogs;
                }
                ++i;
                ++j;
                continue;

            } while (j <= word.length());


            if (countOfCats == countOfDogs) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }

    }
}
