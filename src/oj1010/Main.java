package oj1010;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	int b;
	if(a<=100000) b = a/10;
	else if(a<=200000) b = 10000+(a-100000)*75/1000;
	else if(a<=400000) b = 17500+(a-200000)*50/1000;
	else if(a<=600000) b = 27500+(a-400000)*30/1000;
	else if(a<=1000000) b = 33500+(a-600000)*15/1000;
	else b = 39500+(a-1000000)*10/1000;
	System.out.println(b);
}
}