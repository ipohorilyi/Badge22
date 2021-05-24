package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {
System.nanoTime();
       List<Integer>mlnNums=new ArrayList<>();
       getIntegerList();
    }
    public static List<Integer> getIntegerList(){
        List<Integer>nums=new ArrayList<>();
        for (int i = 0; i <=1000000 ; i++) {
            nums.add(i);
        }
        return nums;
    }
}
