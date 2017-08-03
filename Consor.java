package programmer.demo;

import java.util.Scanner;

public class Consor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] a = new int[N];
			// String[] strings = new String[M];
			for (int i = 0; i < N; i++) {
				a[i] = sc.nextInt();
			}
			sc.nextLine();
			for (int i = 0; i < M; i++) {
				String[] strings = sc.nextLine().split(" ");
				// System.out.println(strings.length);
				int n1, n2;
				n1 = Integer.parseInt(strings[1]);
				n2 = Integer.parseInt(strings[2]);
				if (strings[0].equals("Q")) {
					int max = 0;
					for (int j = Math.min(n1, n2) - 1; j < Math.max(n1, n2); j++) {
						if (a[j] > max)
							max = a[j];
					}
					System.out.println(max);
				}
				if (strings[0].equals("U")) {
					a[n1 - 1] = n2;
				}
			}
		}
	}
}
