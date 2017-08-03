package programmer.demo;

import java.util.ArrayList;

/* @author  作者 E-mail: * @date 创建时间：2017年7月18日 上午9:49:51 * @version 1.0 * @parameter  * @since  * @return  */
public class LCA {

	public LCA() {
		// TODO Auto-generated constructor stub
	}
	public static int getLCA(int a, int b) {
        // write code here
		ArrayList<Integer> path1 = new ArrayList<>();
		ArrayList<Integer> path2 =  new ArrayList<>();
		while(a != 0)
		{
			path1.add(a);
			a /= 2;
		}
		while(b != 0)
		{
			path2.add(b);
			b /= 2;
		}
		int i = path1.size() - 1;
		int j = path2.size() - 1;
		int last = 0;
		while(i >= 0 && j >= 0)
		{
			if(!path1.get(i).equals(path2.get(j)))
				break;
			last = path1.get(i);
			i--;
			j--;
		}
		return last;
    }
	public static void main(String[] args)
	{
		int last = getLCA(106206, 53005);
		System.out.println(last);
	}
}
