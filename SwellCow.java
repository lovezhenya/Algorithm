package programmer.demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SwellCow {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A = sc.nextInt();
		int[] a = new int[n];
		BigInteger sum = new BigInteger(String.valueOf(A));
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < a.length; i++)
		{
			if(new BigInteger(String.valueOf(a[i])).equals(sum))
			sum = sum.multiply(new BigInteger(String.valueOf(2)));
		}
		System.out.println(sum);
	}
}
