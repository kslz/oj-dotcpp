package oj1011;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	int b = x.nextInt();
	int big,small,e;
	if(a>b) {big=a;small=b;}
	else {big=b;small=a;}
	for(int i=small;i>=1;i--)
		if((big%i==0)&&(small%i==0)) {System.out.println(i);break;}
	for(int i=big;i<=a*b;i++)
		if((i%small==0)&&(i%big==0)) {System.out.println(i);break;}
}
}