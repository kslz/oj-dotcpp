package oj1074;
/**import java.util.Scanner;
import java.math.BigInteger;
public class Main {
public static void main(String[] args) {
//此题中需要使用BigInteger
	Scanner x = new Scanner(System.in);
	int[] a = new int[10];
	int z=10;
	for(int i = 0;i<10;i++)
	{
		a[i]=x.nextInt();
		if(a[i]==0){z = i; break;}				
	}
	for(int i=0;i<z;i++)
	{
		int gewei;
		int shengxia;
		int sum;
		sum = a[i];
		gewei = sum%10;
		shengxia = sum/10-5*gewei;
		if(shengxia<0)shengxia = -shengxia;
		if(shengxia%17==0)System.out.println("1");
		else System.out.println("0");	
	}
	
}
}*/
import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final BigInteger SEVENTEEN = BigInteger.valueOf(17);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if("0".equals(str))
                break;
            BigInteger a = new BigInteger(str.substring(0, str.length()-1));
            int b = 5 * Integer.valueOf(str.substring(str.length()-1));
            BigInteger rs = a.subtract(BigInteger.valueOf(b)).mod(SEVENTEEN);
            System.out.println(rs.intValue() == 0 ? 1 : 0);
        }
        sc.close();
    }
     
}