package oj1057;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        if(a<1) {
            System.out.println(df.format(a));
        }else if (a<10){
            System.out.println(df.format(a*2-1));
        }else {
            System.out.println(df.format(a*3-11));
        }
    }
}
