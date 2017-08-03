package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月16日 下午4:04:36 * @version 1.0 * @parameter  * @since  * @return  */
public class Board {

	public Board() {
		// TODO Auto-generated constructor stub
	}
	public static boolean checkWon(int[][] board) {
        // write code here
		if(board[0][0] + board[1][1] + board[2][2] == 3)
			return true;
		if(board[2][0] + board[1][1] + board[0][2] == 3)
			return true;
		for(int i = 0; i < board.length; i++)
		{
			if(board[i][0] + board[i][1] + board[i][2] == 3)
				return true;
			if(board[0][i] + board[1][i] + board[2][i] == 3)
				return true;
		}
		return false;
    }
}
