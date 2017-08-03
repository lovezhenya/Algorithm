package programmer.demo;

import java.util.ArrayList;
import java.util.Collections;

/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��31�� ����10:49:03 * @version 1.0 * @parameter  * @since  * @return  */
public class StringFullPermuation {

	/*
	 * ����һ
	 */

	public static ArrayList<String> getPerms(String str) {
		if (str == null)
			return null;
		ArrayList<String> permutation = new ArrayList<>();
		if (str.length() == 0) {
			permutation.add("");
			return permutation;
		}
		char first = str.charAt(0);
		String reminder = str.substring(1);
		ArrayList<String> words = getPerms(reminder);
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				String s = insertCharAt(word, first, j);
				permutation.add(s);
			}
		}
		return permutation;
	}

	public static String insertCharAt(String word, char c, int i) {
		String start = word.substring(0, i);
		String end = word.substring(i);
		return start + c + end;
	}
}
