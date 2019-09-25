package oj1009;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int[] a = new int[5];
	String b;
	b = x.nextLine();
//	for(int i=0;i<b.length();i++) {
//		a[i]= (int) (b.charAt(i) + 4);
//		}
	System.out.println(b.length());
	for(int i=0;i<b.length();i++) {
 		System.out.print(b.charAt(i)+" ");
 		}
	System.out.print("\n");
	//System.out.println("\b");退格在eclipse中不起作用
	for(int i=b.length()-1;i>=0;i--) {
 		System.out.print(b.charAt(i));
 		}
}
}