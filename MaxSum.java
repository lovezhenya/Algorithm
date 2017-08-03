package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月19日 下午5:56:32 * @version 1.0 * @parameter  * @since  * @return  */
public class MaxSum {

	public MaxSum() {
		// TODO Auto-generated constructor stub
	}
	public static int getMaxSum(int[] A, int n) {
        // write code here
		if(n == 1)
			return A[0];
		if(n < 1)
			return 0;
		int[] SUM = new int[n];
		SUM[0] = A[0];
		for(int i = 1; i < SUM.length; i++)
		{
			if(SUM[i-1] > 0)
			{
				SUM[i] = SUM[i-1] + A[i];
			}
			else {
				SUM[i] = A[i];
			}
		}
		int max = A[0];
		for(int i = 0; i < n; i++)
		{
			if(max < SUM[i])
				max = SUM[i];
		}
		return max;
    }
	public static void main(String[] args)
	{
		int[] a = {2,4,-7,5,2,-1,2,-4,3};
		System.out.println(getMaxSum(a, a.length));
	}
}
