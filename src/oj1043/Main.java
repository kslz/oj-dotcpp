package oj1043;

//import java.util.Arrays;//ÅÅÐòº¯Êý
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int[] z = new int[3];
		z[0] = x.nextInt();
		z[1] = x.nextInt();
		z[2] = x.nextInt();
		int y;
		//Arrays.sort(z); //ÅÅÐòº¯Êý
		for (int i = 0; i < 2; i++) {
			if (z[i] > z[i + 1]) {
				y = z[i];
				z[i] = z[i + 1];
				z[i + 1] = y;
			}
		}
		if (z[0] > z[1]) {
			y = z[0];
			z[0] = z[1];
			z[1] = y;
		}
		for (int i = 0; i <= 2; i++)
			System.out.print(z[i] + " ");
	}
}