package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月15日 下午12:26:02 * @version 1.0 * @parameter  * @since  * @return  */
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
	 * 对于一个元素各不相同且按升序排列的有序序列，请编写一个算法，创建一棵高度最小的二叉查找树。
给定一个有序序列int[] vals,请返回创建的二叉查找树的高度。
	 * */
}
