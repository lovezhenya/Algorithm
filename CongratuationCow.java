package programmer.demo;

import java.util.Arrays;
import java.util.Scanner;

public class CongratuationCow {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++)
		{
			a[i] =  sc.nextInt();
		}
		Arrays.sort(a);
		int max = Math.abs(a[0] - a[a.length-1]);
		for(int i = 0; i < a.length - 1; i++)
		{
			int temp = a[i];
			for(int k = i; k > 0; k--)
			{
				a[k] = a[k-1];
			}
			a[0] = temp;
			int maxOfArray = Integer.MIN_VALUE;
			for(int j = 0; j < a.length - 1; j++)
			{
				if(Math.abs(a[j] - a[j+1]) > maxOfArray)
				{
					maxOfArray = Math.abs(a[j] - a[j+1]);
				}
			}
			if(Math.abs(a[0] - a[a.length - 1]) > maxOfArray)
				maxOfArray = Math.abs(a[0] - a[a.length - 1]);
			if(max > maxOfArray)
				max = maxOfArray;
		}
		System.out.println(max);
		
	}
}
