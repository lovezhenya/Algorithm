package programmer.demo;

import java.util.Scanner;

/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��15�� ����12:26:02 * @version 1.0 * @parameter  * @since  * @return  */
public class MinimalBST {

	public MinimalBST() {
		// TODO Auto-generated constructor stub
	}

	public static int buildMinimalBST(int[] vals) {
        // write code here
		if(vals == null)
			return 0;
		int low = 0;
		int high = vals.length - 1;
		TreeNode root = buildMinimalBST(vals, low, high);
		return height(root);
    }
	
	public static TreeNode buildMinimalBST(int[] vals, int low, int high)
	{
		if(low <= high)
		{
			TreeNode root = new TreeNode();
			int mid = (low + high) / 2;
			root.val = vals[mid];
			root.left= buildMinimalBST(vals, low, mid - 1);
			root.right = buildMinimalBST(vals, mid + 1, high);
			return root;
		}
		else
			return null;
	}
	public static int height(TreeNode root)
	{
		if(root != null)
			return Math.max(height(root.left),height(root.right)) + 1;
		else
			return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] vals = new int[N];
		for(int i = 0; i < N; i++)
		{
			vals[i] = i;
		}
		System.out.println(buildMinimalBST(vals));
	}
	/*
	 * ����һ��Ԫ�ظ�����ͬ�Ұ��������е��������У����дһ���㷨������һ�ø߶���С�Ķ����������
����һ����������int[] vals,�뷵�ش����Ķ���������ĸ߶ȡ�
	 * */
}
