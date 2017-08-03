package programmer.demo;

import java.util.Arrays;
import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月13日 下午6:10:33 * @version 1.0 * @parameter  * @since  * @return  */
public class Same {

	public Same() {
		// TODO Auto-generated constructor stub
	}
	public static boolean checkSam(String stringA, String stringB) {
        // write code here
		char[] a1 = stringA.toCharArray();
		char[] a2 = stringB.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return new String(a1).equals(new String(a2));
    }
	
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
//		String s1 = sc.nextLine();
//		String s2 = sc.nextLine();
//		
//		System.out.println(checkSam(s1, s2));
		String s = "ab";
		String ss = s.substring(2);
		System.out.println(ss.length());
	}

}
