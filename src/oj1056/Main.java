package oj1056;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	float F = x.nextFloat();
	float C = 5*(F-32)/9;
	System.out.printf(String.format("%.2f", C));
}
}