package programmer.demo;

import java.util.ArrayList;
import java.util.Scanner;

/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��30�� ����1:09:06 * @version 1.0 * @parameter  * @since  * @return  */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		ArrayList<String> per = new ArrayList<>();
		per.add("");
		System.out.println(per.get(0).equals(""));
		//System.out.println(trans(n));
	}

	public static double trans(int n)  
	{  
		      if(n==1)  
		     return 2.0;  
		     if(n==2)  
		     return 2.5;  
		     if(n % 2 != 1) 
		    	 return trans(n-1)*(2*n)/(2*n-1);  
		     else  
		      return trans(n-1)*(2*n+1)/(2*n);  
	 }
}
