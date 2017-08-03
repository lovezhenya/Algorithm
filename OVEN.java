package programmer.demo;

import java.util.Scanner;

public class OVEN {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length() == 2)
			System.out.println(0);
		for(int i = s.length() - 2;i >= 0; i--)
		{
			if(Judge(s.substring(0, i + 1)))
			{
				System.out.println(i + 1);
				break;
			}
				
		}
	}
	public static boolean Judge(String s)
	{
		if(s.length() % 2 != 0)
			return false;
		else {
			int index = s.length() / 2;
			for(int i = 0; i < index; i++)
			{
				if(s.charAt(i) != s.charAt(index + i))
					return false;
			}
			return true;
		}
	}
}
