package programmer.demo;

import java.util.*;

public class AlphaMatrix {
	public class MatrixSub {
		char c;
		int start = 0;
		int end = 0;

		MatrixSub(char c, int start, int end) {
			this.c = c;
			this.start = start;
			this.end = end;
		}
	}

	public int findAlphaMatrix(String[] dic, int n) {
		ArrayList<ArrayList<MatrixSub>> matrix = new ArrayList<ArrayList<MatrixSub>>();
		for (int i = 0; i < n; i++) {
			String str = dic[i];
			ArrayList<MatrixSub> list = new ArrayList<MatrixSub>();
			char c = str.charAt(0);
			int start = 0, count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == c) {
					count++;
				} else {
					list.add(new MatrixSub(c, start, start + count - 1));
					c = str.charAt(j);
					start = j;
					count = 1;
				}
			}
			list.add(new MatrixSub(c, start, start + count - 1));
			matrix.add(list);
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			ArrayList<MatrixSub> list = matrix.get(i);
			for (int j = 0; j < list.size(); j++) {
				MatrixSub ms = list.get(j);
				char c = ms.c;
				int start = ms.start, end = ms.end, idx = i + 1;
				while (idx < n) {
					int k = 0;
					while (k < matrix.get(idx).size() && matrix.get(idx).get(k).c != c)
						k++;
					if (k == matrix.get(idx).size() || matrix.get(idx).get(k).start > end
							|| matrix.get(idx).get(k).end < start)
						break;
					start = Math.max(start, matrix.get(idx).get(k).start);
					end = Math.min(end, matrix.get(idx).get(k).end);
					max = Math.max(max, (idx - i + 1) * (end - start + 1));
					if (max > (idx - i + 1) * (end - start + 1))
						break;
					idx++;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		AlphaMatrix x = new AlphaMatrix();
		String[] s = { "abc", "bcd", "cde" };
		System.out.println(x.findAlphaMatrix(s, s.length));
	}
}
