package oj1007;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y;
	if(x<1)y=x;
	else if(x<10)y=2*x-1;
	else y=3*x-11;
	System.out.print(y);
}
}
