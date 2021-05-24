package Replits.Arrays;

import java.util.Scanner;

public class findSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
       int sum=0;
        for (int i = 0; i <5 ; i++) {
           sum+=nums[i];
        }
        System.out.println(sum);





    }
}
