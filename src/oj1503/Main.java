package oj1503;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int[] a = new int[10];
	int b;
	int c=0;
	for(int i=0;i<10;i++)
		a[i] = x.nextInt();
	b = (a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9])/10;
	for(int i=0;i<10;i++)
		if(a[i]>b) c++;
	System.out.println(c);
}
}