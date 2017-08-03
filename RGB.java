package programmer.demo;

import java.util.Scanner;

public class RGB {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int tran = 0;
		int count = 1;
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count % 2 == 0)
				{
					tran += count / 2;
				}
				else
				{
					tran += (count - 1) / 2;
				}
				count = 1;
			}
		}
		if(count % 2 == 0 )
		{
			tran = tran + count / 2;
		}
		else
		{
			tran += (count - 1) / 2;
		}
		System.out.println(tran);
	}
	}