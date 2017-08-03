package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月10日 下午3:31:22 * @version 1.0 * @parameter  * @since  * @return  */
public class UniqueChars {
	public UniqueChars() {
		// TODO Auto-generated constructor stub
	}
	public static boolean isUniqueChars(String str)
	{
		if(str.length() > 256)
			return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i);
			if(false == char_set[val])
				char_set[val] = true;
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String str = sc.nextLine();
			System.out.println(isUniqueChars(str));
		}
	}

}
