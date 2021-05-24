package day43_list_custom_classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethodsAndRandom {
    public static List<String> getDays() {

        List<String> days = new ArrayList<>(Arrays.asList("Mon, Tue, Wed, Thu, Fri, Sut, Sun"));
        return days;
    }

    public static List<Integer> getRandomList(int size){
        Random random= new Random();
        List<Integer> nums= new ArrayList<>();
        for (int i=1; i<size; i++){
            nums.add(random.nextInt(101));
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(getRandomList(10));
    }
}
