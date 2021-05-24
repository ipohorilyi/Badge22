package day42_arrayList;

import java.util.List;


public class MethodWithinList {
    public static void printStrList(List<String>stringList) {
      for(String str:stringList){
          System.out.println(str +" ");
      }
        System.out.println();
    }
   static public int  sumIntegerList(List<Integer>list){
      int sum=0;
       for (int i :list         ) {
           sum+=i;
       }
       return sum;
    }
}
