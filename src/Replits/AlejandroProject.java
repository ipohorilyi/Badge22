package Replits;

import java.util.Scanner;

public class AlejandroProject {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        if (a.contains("project") && a.contains("alejandro")){
            System.out.println("read");
        }
        else {
            System.out.println("don't read");
        }
    }
}
