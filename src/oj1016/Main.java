package oj1016;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	for(int a=100;a<1000;a++)
	{int b,c,d;
		b=a/100;
		c=(a-b*100)/10;
		d=a%10;
		if(a==b*b*b+c*c*c+d*d*d)System.out.println(a);
	}
}
}