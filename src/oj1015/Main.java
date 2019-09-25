package oj1015;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int a = x.nextInt();
	int b = x.nextInt();
	int c = x.nextInt();
	double d=0;
	for(int i=1;i<=a;i++)
	{
		d += i;
	}
	for(int i=1;i<=b;i++)
	{
		d += i*i;
	}
	for(int i=1;i<=c;i++)
	{
		d += 1.0/i;
	}
	System.out.println(String.format("%.2f", d));

}
}