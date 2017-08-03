package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年8月3日 上午11:04:24 * @version 1.0 * @parameter  * @since  * @return  */

import java.util.Vector;

public class NQueen {

	static int m_Queen = 8;
	static Vector<Vector<Integer>> anwser = new Vector<Vector<Integer>>();
	static boolean[] m_MainDiagonal = new boolean[2*m_Queen-1];
	static boolean[] m_MinorDiagonal = new boolean[2*m_Queen-1];
	static boolean[] m_Column = new boolean[m_Queen];
	public static void main(String[]  args)
	{
		int[] path = new int[m_Queen];
	}
	public static void Queen(int[] path)
	{
		CalResult(path, 0);
	}
	public static void CalResult(int[] path, int row)
	{
		if(row == m_Queen)
		{
			Vector<Integer> vec = new Vector<>();
			for(int i = 0; i < path.length; i++)
			{
				vec.add(path[i]);
			}
			anwser.add(vec);
			return;
		}
		for(int col = 0; col < m_Queen; col++)
		{
			if(isVaild(col, row))
			{
				path[row] = col;
				m_Column[col] = true;
				m_MainDiagonal[row-col+m_Queen-1] = true;
				m_MinorDiagonal[row+col] = true;
				CalResult(path, row + 1);
				m_Column[col] = false;
				m_MainDiagonal[row-col+m_Queen-1] = false;
				m_MinorDiagonal[row+col] = false;
			}
		}
		
	}
	public static boolean isVaild(int col, int row)
	{
		return !m_Column[col] && !m_MainDiagonal[row-col+m_Queen-1] && !m_MinorDiagonal[row+col];
	}
}
