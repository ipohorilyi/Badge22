package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);
        for (int num:nums) {
            if (Collections.frequency(nums,num)==1){
                System.out.println(num +" ");
            }
        }

    }
}
