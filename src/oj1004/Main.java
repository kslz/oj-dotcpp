package oj1004;
import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
    	  Scanner x = new Scanner(System.in);
    		int[] a = new int[50];
    		int z=10;
    		for(int i = 0;i<50;i++)
    		{
    			a[i]=x.nextInt();
    			if(a[i]==0){z = i; break;}				
    		}
    		for(int i=0;i<z;i++)
    		{
    			if(a[i]<=4)System.out.println(f(a[i]));
    			else
                    System.out.println(f(a[i]-1)+f(a[i]-3));
    		}
          }
      public static int f(int n) {
       if(n<=4)
         return n;
       else
          return f(n-1)+f(n-3);
                              }
        }