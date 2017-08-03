package programmer.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsenceCow {

	public static boolean judge(ArrayList<Integer> l1, ArrayList<Integer> l2)
	{
		for(int i = 0; i < l1.size(); i++)
		{
			if(l1.get(i) != l2.get(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
//		StringBuffer sb = new StringBuffer();
		int[] a = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			list.add(a[i]);
		}
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = i + 1; j < a.length; j++)
			{
				ArrayList<Integer> list2 = new ArrayList<>(list);
				int temp = list2.get(i);
				list2.set(i, list2.get(j));
				list2.set(j, temp);
				lists.add(list2);
				
			}
		}
		for(int i = 0; i < lists.size() - 1; i++)
		{
			for(int j = i + 1; j < lists.size(); j++)
			{
				ArrayList<Integer> li = new ArrayList<>();
				li.add(Integer.MIN_VALUE);
				ArrayList<Integer> list3 = lists.get(i);
				ArrayList<Integer> list4 = lists.get(j);
				if(judge(list3, list4))
					lists.set(j,li);
			}
		}
		int count = 0;
		for(int i  = 0; i < lists.size(); i++)
		{
			if(lists.get(i).get(0) != Integer.MIN_VALUE)
				count++;
		}
		System.out.println(count);
	}
}
