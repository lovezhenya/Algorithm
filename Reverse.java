package programmer.demo;

import java.util.Scanner;

/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��13�� ����5:52:10 * @version 1.0 * @parameter  * @since  * @return  */
public class Reverse {

	public Reverse() {
		// TODO Auto-generated constructor stub
	}
	public static String reverseString(String iniString) {
        // write code here
		StringBuffer sb = new StringBuffer(iniString);
		sb.reverse();
		return sb.toString();
    }
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverseString(s));
	}
}
