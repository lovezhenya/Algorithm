package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月13日 下午6:20:17 * @version 1.0 * @parameter  * @since  * @return  */
public class SpaceReplace {

	public SpaceReplace() {
		// TODO Auto-generated constructor stub
	}
	public static String replaceSpace(String iniString, int length) {
        // write code here
		int count = 0;
		for(int i = 0; i < iniString.length(); i++)
		{
			if(iniString.charAt(i) == ' ')
				count++;
		}
		int newcount = 2 * count;
		char[] a = new char[newcount+iniString.length()];
		int j = a.length - 1;
		for(int i = iniString.length() - 1; i >= 0; i--)
		{
			if(iniString.charAt(i) != ' ')
			{
				a[j] = iniString.charAt(i);
				j--;
			}else {
				a[j--] = '0';
				a[j--] = '2';
				a[j--] = '%';
			}
		}
		String s = new String(a);
		return s;
    }
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(replaceSpace(s, s.length()));
		
	}
}
