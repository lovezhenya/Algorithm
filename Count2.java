package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月15日 下午3:25:27 * @version 1.0 * @parameter  * @since  * @return  */
public class Count2 {

	public Count2() {
		// TODO Auto-generated constructor stub
	}
	public static int countNumberOf2s(int n) {
        // write code here
		if(n == 2)
			return 1;
		if(n <= 1)
			return 0;
		int count = 0;
		for(int i = 2; i <= n; i++)
		{
			count += Number(i);
		}
		return count;
    }
	public static int Number(int n)
	{
		int count = 0;
		while(n / 10 != 0)
		{
			if(n%10 == 2)
			{
				count++;
			}
			n = n / 10;
		}
		if(n == 2)
			count++;
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countNumberOf2s(n));
	}
}
