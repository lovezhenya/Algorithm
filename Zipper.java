package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月13日 下午6:47:02 * @version 1.0 * @parameter  * @since  * @return  */
public class Zipper {

	public Zipper() {
		// TODO Auto-generated constructor stub
	}
	public static String zipString(String iniString) {
        // write code here
		int count = 1;
		if(iniString.length() <= 1)
			return iniString;
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i < iniString.length(); i++)
		{
			if(iniString.charAt(i) == iniString.charAt(i - 1))
				count++;
			else
			{
				sb.append(iniString.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		sb.append(iniString.charAt(iniString.length() - 1));
		sb.append(count);
		if(sb.length() < iniString.length())
			return sb.toString();
		else
			return iniString;
    }
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(zipString(s));
	}
}
