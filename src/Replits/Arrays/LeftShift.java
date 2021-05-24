package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int first= nums[nums.length-1];
        for (int i = nums.length-2; i>=0 ; i--) {
            nums[i]=nums[i+1];
        }
        System.out.println(Arrays.toString(nums));



    }
}
