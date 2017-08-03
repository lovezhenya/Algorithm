package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��19�� ����11:59:09 * @version 1.0 * @parameter  * @since  * @return  */
public class Coins {

	public Coins() {
		// TODO Auto-generated constructor stub
	}
	public static int countWays(int n) {
        // write code here
		//ǰi��Ӳ�����Ϊn����ϸ���Ϊdp[i][sum]
		int[] a = {1,5,10,25};
		int dp[][] = new int[4+1][n+1];
		for(int i = 0; i < dp[0].length; i++)
		{
			dp[0][i] = 0;
		}
		for(int i = 0; i < dp.length; i++)
		{
			dp[i][0] = 0;
			
		}
		for(int i = 1; i < dp[0].length; i++)
		{
			dp[1][i] = 1;
		}
		for(int i = 2; i < dp.length; i++)
		{
			for(int j = 1; j < dp[0].length; j++)
			{
				if(j > a[i-1])
				{
					dp[i][j] = (dp[i-1][j] + dp[i][j-a[i-1]]) % 1000000007;
				}
				else if(j == a[i-1])
				{
					dp[i][j] = (dp[i-1][j] + 1) % 1000000007 ;
				}
				else {
					dp[i][j] = (dp[i-1][j]) % 1000000007;
				}
			}
		}
		return dp[4][n];
    }
	public static void main(String[] args)
	{
		int n = 25;
		System.out.println(countWays(n));
	}
}
