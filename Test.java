package programmer.demo;

import java.util.ArrayList;

/* @author  作者 E-mail: * @date 创建时间：2017年7月18日 下午12:45:09 * @version 1.0 * @parameter  * @since  * @return  */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(7);
		ArrayList<Integer> list3 = new ArrayList<>();
		list3.addAll(list);
		solution.add(list3);
		ArrayList<Integer> list2 = new ArrayList<>();
		list.add(6);
		list2.addAll(list);
		solution.add(list2);
		for(int i = 0; i < solution.size(); i++) 
		{
			for(int j = 0; j < solution.get(i).size(); j++)
			{
				System.out.print(solution.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
