package programmer.demo;

import java.util.ArrayList;
import java.util.Collections;

/* @author  作者 E-mail: * @date 创建时间：2017年7月31日 上午10:49:03 * @version 1.0 * @parameter  * @since  * @return  */
public class StringFullPermuation {

	/*
	 * 方法一
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
