package programmer.demo;

import java.util.Scanner;

public class DNA {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int max = 0;
		int count = 0;
		if(s.length() == 1)
			if(s.charAt(0) == 'A' || s.charAt(0) == 'T' || s.charAt(0) == 'C' || s.charAt(0) == 'G')
				System.out.println(1);
		for(int i = 0; i < s.length() - 1; i++)
		{
			if(s.charAt(i) == 'A' || s.charAt(i) == 'T' || s.charAt(i) == 'C' || s.charAt(i) == 'G')
			{
				count++;
				for(int j = i + 1; j < s.length(); j++)
				{
					if(s.charAt(j) == 'A' || s.charAt(j) == 'T' || s.charAt(j) == 'C' || s.charAt(j) == 'G')
					{
						count++;
						continue;
					}
					else {
						if(count > max)
							max = count;
						count = 0;
						break;
					}
				}
				if(count == s.length())
					break;
			}
			count = 0;
		}
		if(max < count)
			max = count;
		if(s.length() != 1)
			System.out.println(max);
	}
}
