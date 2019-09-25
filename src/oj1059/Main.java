package oj1059;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int[] sum = new int[50];
	sum[0] = 2;
	int a = 2;
	int b = x.nextInt();
	for(int i=1;i<b;i++)
	{
		sum[i]=sum[i-1]+3;
		a+=sum[i];
	}
		
	System.out.println(a);
}
}