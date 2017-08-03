package programmer.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "aba", "baa", "abc", "cba", "bac", "acbd" };
		ArrayList<String> list = sortStrings(str, str.length);
		System.out.println(list.toString());
	}

	public static ArrayList<String> sortStrings(String[] str, int n) {
		// write code here
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		String[] strings = new String[set.size()];
		int k = 0;
		for (String string : set) {
			strings[k] = string;
			k++;
		}
		set.clear();
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			list.add(strings[i]);
			list2.add(strings[i]);
		}
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list2.size(); j++) {
				if (checkSam(list.get(i), list2.get(j))) {
					list2.set(j, " ");
					// list2.remove(j);
					break;
				}
			}
		}
		list.clear();
		for (String string : list2) {
			if (!string.equals(" "))
				list.add(string);
		}
		return list;
	}

	public static boolean checkSam(String stringA, String stringB) {
		// write code here
		if (stringA == null || stringB == null)
			return false;
		char[] a1 = stringA.toCharArray();
		char[] a2 = stringB.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return new String(a1).equals(new String(a2));
	}
}
