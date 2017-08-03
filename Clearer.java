package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月13日 下午7:15:02 * @version 1.0 * @parameter  * @since  * @return  */
public class Clearer {

	public Clearer() {
		// TODO Auto-generated constructor stub
	}
//	if(row[i] == true)
//	{
//		for(int j = 0; j < n; j++)
//		{
//			mat[i][j] = 0;
//		}
//	}
//	if(col[i] == true)
//	{
//		for(int j = 0; j < n; j++)
//		{
//			mat[j][i] = 0;
//		}
//	}
	public static int[][] clearZero(int[][] mat, int n) {
        // write code here
		boolean[] row = new boolean[n];
		boolean[] col = new boolean[n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(mat[i][j] != 0)
					 continue;
				else {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			if(row[i] || col[j])
				mat[i][j] = 0;
		}
		return mat;
    }
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;
		int[][] mat = new int[row][col];
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		mat = clearZero(mat, col);
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				//mat[i][j] = sc.nextInt();
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		
	}
}
