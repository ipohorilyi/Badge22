package Replits.Methods;

import java.util.Scanner;

public class mergeString {
    public static String mergeStrings(String one, String two) {
        String result="";
        for(int i=0; i<one.length(); i++){
            result+=one.charAt(i);
                    result+=two.charAt(i);
        }

return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
