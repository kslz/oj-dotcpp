package oj1020;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int N = x.nextInt();
	int sum = 1;
	for(int i=1;i<N;i++)
	{
		sum=(sum+1)*2;
	}
	System.out.println(sum);
}
}