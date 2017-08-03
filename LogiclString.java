package programmer.demo;

import java.util.Scanner;

public class LogiclString {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1)
			System.out.println(1);
		else {
			
			boolean[] a = new boolean[N + 1];
			int sum = (int)Math.pow(2, N);
			for(int i = 2; i <= N; i++)
			{
				int count = 0;
				a[i] = false;
				for(int j = 2; i*j <= N; j++)
				{
					count++;
				}
				int index = (int)Math.pow(2, count);
				sum = sum - (index - 1)*(N- count -2)*2;
			}
			sum = (sum - (int)Math.pow(2, N-1)) % 1000000007;
			System.out.println(sum);
		}
		
	}
}
