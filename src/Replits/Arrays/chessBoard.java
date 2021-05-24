package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class chessBoard {
    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i <8 ; i++) {
           char letters='a';
            for (int j = 0; j <=7 ; j++) {
                chessBoard[i][j]=""+(i+1)+letters;
                letters++;
            }
        }



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));






    }
}