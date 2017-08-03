package programmer.demo;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/* @author  作者 E-mail: * @date 创建时间：2017年8月1日 上午11:40:56 * @version 1.0 * @parameter  * @since  * @return  */
public class BFPRT {

	public static int Select(int[] a, int p, int r, int k) {
		if (r - p < 75) {
			Arrays.sort(a);
			return a[p + k - 1];
		}
		for (int i = 0; i <= (r - p + 1 - 5) / 5; i++) {
			int temp = a[i];
			swap(5 * i, 5 * i + 4, 3, a);
		}
		int x = Select(a, p, p + (r - p + 1 - 5) / 5, (r - p + 1 - 5) / 10);// 中位数的中位数
		int i = Partition(a, p, r, x), j = i - p + 1;
		if (k <= j)
			return Select(a, p, i, k);
		else
			return Select(a, i + 1, r, k - j);
	}

	public static void swap(int begin, int end, int minThird, int[] a) {
		Arrays.sort(a, begin, end);
		int temp = a[begin];
		a[begin] = a[begin + minThird];
		a[begin + minThird] = temp;

	}

	public static int Partition(int[] a, int p, int r, int partValue) {
		// 相当于快速排序的中的一趟
		int pivot = partValue;
		int partValueId = FindpartValueId(a, partValue);
		a[partValueId] = a[0];
		a[0] = pivot;
		int left = p;
		int right = a.length - 1;
		while (left < right) {
			while (a[right] > pivot)
				right--;
			a[left] = a[right];
			while (a[left] < pivot)
				left++;
			a[right] = a[left];
		}
		a[left] = a[0];
		return left;
	}

	public static int FindpartValueId(int[] a, int partValue) {
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] != partValue)
				continue;
			else
				break;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Character> ts = new LinkedHashSet<>();
		String s= "abecbfer";
		char[] b= s.toCharArray();
		for(int i = 0; i < b.length; i++)
		{
			ts.add(b[i]);
		}
		System.out.println(ts.toString());
		System.out.println("--------------");
		int[] a = { 12, 76, 29, 22, 15, 62, 29, 58, 35, 67, 58, 33, 28, 89, 90, 28, 64, 48, 20, 77 };
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int minKth = Select(a, 0, a.length - 1, k);
		System.out.println(minKth);

	}

}
