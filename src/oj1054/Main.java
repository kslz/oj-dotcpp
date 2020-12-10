package oj1054;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int m = x.nextInt();
        int n = x.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int x){
        if(x==1){
            return false;
        }
        if(x==2){
            return true;
        }
        for(int i=2;i<x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

}
