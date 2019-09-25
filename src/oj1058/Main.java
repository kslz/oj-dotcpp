package oj1058;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a=0;
	int b;
	int n=x.nextInt();
	for(int i=0;i<n;i++)
	{
		b=x.nextInt();
		if(b%2==0)a+=b;
	}
		
	System.out.println(a);
}
}