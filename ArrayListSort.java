package programmer.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/* @author  作者 E-mail: * @date 创建时间：2017年7月22日 下午12:11:55 * @version 1.0 * @parameter  * @since  * @return  */
public class ArrayListSort {

	public ArrayListSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();
		arrayList.add(45);
		arrayList.add(23);
		arrayList.add(67);
		arrayList.add(12);
		Collections.sort(arrayList);
		arrayList2.add(67);
		arrayList2.add(12);
		Collections.sort(arrayList2);
		ar.add(arrayList);
		ar.add(arrayList2);
		Collections.sort(ar, new Comparator<ArrayList<Integer>>() {

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
				return 0;
//				if(o1length > o2length)
//				return -1;
//				else if(o1length == o2length)
//					return 0;
//				else {
//					return 1;
//				}
			}

		});
		System.out.println(ar.get(0));

	}
}
