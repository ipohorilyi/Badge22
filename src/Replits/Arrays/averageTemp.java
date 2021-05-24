package Replits.Arrays;

import java.util.Scanner;

public class averageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        for (int i = 0; i <=7 ; i++) {
            total+=temps[i];
        }
        System.out.println(avgTemp=total/8);
    }
}
