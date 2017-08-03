package programmer.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* @author  作者 E-mail: * @date 创建时间：2017年7月22日 下午1:27:27 * @version 1.0 * @parameter  * @since  * @return  */
public class Subset {

	public Subset() {
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<ArrayList<Integer>> getSubsets(int[] A, int n) {
        // write code here
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < A.length; i++)
		{
			if(arrayList.size() == 0)
			{
				arrayList.add(A[i]);
				lists.add(arrayList);
				
			}
			else
			{
				ArrayList<ArrayList<Integer>> list2s = new ArrayList<ArrayList<Integer>>();
				list2s.addAll(lists);
				for(int j = 0; j < lists.size(); j++)
				{
					ArrayList<Integer> list2 = new ArrayList<>(lists.get(j));
					list2.add(A[i]);
					list2s.add(list2);
				}
				ArrayList<Integer> ll = new ArrayList<Integer>();
				ll.add(A[i]);
				list2s.add(ll);
				lists = list2s;
			}
		}
		return lists;
    }
	public static void main(String[] args)
	{
		int[] A = {123,456,789};
		ArrayList<ArrayList<Integer>> list2s = getSubsets(A, 3);
		for(int i = 0; i < list2s.size(); i++)
		{
			Collections.sort(list2s.get(i), new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					if(o1 < o2)
						return 1;
					else if(o1 > o2)
						return -1;
					else
						return 0;
				}
			});
		}
		//Collections.sort(list2s);
		Collections.sort(list2s, new Comparator<ArrayList<Integer>>() {

			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				// TODO Auto-generated method stub
				int o1length = o1.size();
				int o2length = o2.size();
				int length = Math.min(o1length, o2length);
				for (int i = 0; i < length; i++) {

					if (o1.get(i) > o2.get(i))
						return -1;
					else if (o1.get(i) == o2.get(i))
						continue;
					else {
						return 1;
					}
				}
				if(o1length > o2length)
				return 1;
				else if(o1length == o2length)
					return 0;
				else {
					return -1;
				}
			}

		});
		for(int i = 0; i < list2s.size(); i++)
		{
			System.out.println(list2s.get(i));
		}
	}
}
