package programmer.demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BlackCow {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length() == 1)
			System.out.println(1);
		else {
			Set<String> set = new HashSet<>();
			for(int i = 0; i < s.length(); i++)
			{
				
				StringBuffer sb = new StringBuffer(s);
				StringBuffer sb2 = sb.deleteCharAt(i);
				set.add(sb2.toString());
			}
			System.out.println(set.size());
		}
		
	}
}
