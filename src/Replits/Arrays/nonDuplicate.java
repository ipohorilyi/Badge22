package Replits.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int unique=0;
        Arrays.sort(nums);
        for (int i = 0; i <=6 ; i++) {
            for (int j = i+1; j <=6 ; j++) {
                if (nums[i]==nums[j]){

                    break;

                }else if (nums[i]!=nums[j]){
                    unique=nums[i];
                }
            }
        }
        System.out.println(unique);

    }
}
