package Replits.ArrayListPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {






    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

       // System.out.println(appendPosSum(list));

    }
}
