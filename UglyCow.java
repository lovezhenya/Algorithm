package programmer.demo;

import java.util.Scanner;

public class UglyCow {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0; 
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i) != '?')
				count++;
		}
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '?')
			{
				if((i- 1) >= 0 && (i + 1) <= (s.length() - 1))
				{
					if(s.charAt(i-1) != s.charAt(i+1))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
