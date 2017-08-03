package programmer.demo;

/* @author  作者 E-mail: * @date 创建时间：2017年7月20日 上午10:32:05 * @version 1.0 * @parameter  * @since  * @return  */
public class Robot {

	public Robot() {
		// TODO Auto-generated constructor stub
	}

	public static int countWays(int x, int y) {
		// write code here
		int[][] dp = new int[x][y];
		for (int j = 1; j < dp[0].length; j++) {
			dp[0][j] = 1;
		}
		for (int j = 1; j < dp.length; j++) {
			dp[j][0] = 1;
		}
		for(int i = 1; i < dp.length; i++)
		{
			for(int j = 1; j < dp[0].length; j++)
			{
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		return dp[x-1][y-1];
	}
	public static void main(String[] args)
	{
		int x = 2,y = 2;
		System.out.println(countWays(x, y));
	}
}
