package Replits.Arrays;

import java.util.Scanner;

public class countEvens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int max =0;
        for (int i = 1; i <=4 ; i++) {
           if (max<nums[i]){
               max=nums[i];

           }
        }
        System.out.println(max);
    }
}
