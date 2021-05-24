package Replits.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class treeDArray {
    public static void main(String[] args) {
        int values[][][]={{{5,5,5,5},{5,5,5,5}},
                       {{7,7,7,7},{7,7,7,7}},
                       {{8,8,8,8},{30,31,32,33}}};
        System.out.println(Arrays.deepToString(values));
    }
}
