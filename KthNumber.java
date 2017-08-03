package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 上午10:27:51 * @version 1.0 * @parameter  * @since  * @return  */
public class KthNumber {

	public KthNumber() {
		// TODO Auto-generated constructor stub
	}
	public static int findKth(int k) {
        // write code here
		int count = 0;
		int i = 2; 
		while(count < k)
		{
			if(judgePrime(i) == 1)
				count++;
			i++;
		}
		return (i - 1);
    }
	public static int judgePrime(int p)
	{
		for(int i = 2; i <= (p / 2); i++ )
		{
			if(p % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int k = 3;
		System.out.println(findKth(k));
	}
}
