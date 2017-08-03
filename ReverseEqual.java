package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月14日 上午10:05:38 * @version 1.0 * @parameter  * @since  * @return  */
public class ReverseEqual {

	public ReverseEqual() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isContainSubString(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		if (s1.length() < s2.length())
			return false;
		if(s1.length() == 0 || s2.length() == 0)
			return false;
		if (s1.charAt(0) != s2.charAt(0))
			return isContainSubString(s1.substring(1), s2);
		else {
			
			if (s2.length() == 1)
				return true;
			else {
				return isContainSubString(s1.substring(1), s2.substring(1));
			}
		}
	}

	public static boolean checkReverseEqual(String s1, String s2) {
		// write code here
		StringBuffer sb = new StringBuffer(s1 + s1);
		return isContainSubString(sb.toString(), s2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(checkReverseEqual(s1, s2));
	}
}
