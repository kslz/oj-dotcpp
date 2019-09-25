package oj1019;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	double M = x.nextInt();
	double N = x.nextInt();
	double high = M/2;
	double way = M;
	for(int i = 1;i<N;i++)
	{
		way += high*2;
		high = high/2;
	}
	System.out.printf("%.2f %.2f",high,way);
}
}