package oj1952;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int[] a= new int[3];
	int z;
	a[0]= x.nextInt();
	a[1]= x.nextInt();
	a[2]= x.nextInt();
	z = a[0];
	for(int i=1;i<=2;i++) {
		if(z<a[i])z=a[i];
	}
	System.out.println(z);
}
}
