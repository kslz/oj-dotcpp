package oj1003;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner x = new Scanner(System.in);
String abc = x.nextLine();
char[] a = new char[50];
for(int i=0;i<abc.length();i++) {
char c1= (char) (abc.charAt(i) + 4);
a[i]=c1;
}
for(int j=0;j<abc.length();j++) {
System.out.print(a[j]);
}
}
}