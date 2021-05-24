package Replits.Methods;

import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        if (s.equals("12:00:00AM")){
            System.out.println("00:00:00");
        }else if (s.equals("12:00:00PM")){
            System.out.println("12:00:00");
        }else if (s.endsWith("AM")){
            System.out.println(s.replace("AM",""));
        }else if (s.endsWith("PM")){
            int hour= Integer.parseInt(s.substring(0,s.indexOf(":")));
            hour+=12;
            String newTime=hour+s.substring(2).replace("PM","");
        }



    }
}
