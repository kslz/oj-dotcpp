package oj1119;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	int b,c,d;
	b=a/100;
	c=(a-b*100)/10;
	d=a%10;
	if(a==b*b*b+c*c*c+d*d*d)System.out.println(1);
	else System.out.println(0);
}
}