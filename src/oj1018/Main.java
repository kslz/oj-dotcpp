package oj1018;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	double[] fenZi = new double[a];
	double[] fenMu = new double[a];
	double sum=3.5;
	fenZi[0] = 2;
	fenZi[1] = 3;
	fenMu[0] = 1;
	fenMu[1] = 2;
	for(int i=2;i<a;i++)
	{
		fenZi[i]=fenZi[i-1]+fenZi[i-2];
		fenMu[i]=fenMu[i-1]+fenMu[i-2];
		sum+=fenZi[i]/fenMu[i];
	}
	System.out.printf("%.2f",sum);
}
}