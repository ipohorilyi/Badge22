package Replits.Arrays;

import java.util.Scanner;

public class Find55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        boolean contain =false;

            for (int i = 0; i <4 ; i++) {

                if (nums[i] == 5 && nums[i + 1] == 5) {
                    contain=true;

                }

        }System.out.println(contain);
    }
}
