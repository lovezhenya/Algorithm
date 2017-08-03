package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��15�� ����10:02:29 * @version 1.0 * @parameter  * @since  * @return  */

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
	public TreeNode()
	{
		
	}
}

public class TreeBalance {
	static int counter = 0;
	public TreeBalance() {
		// TODO Auto-generated constructor stub
	}

	public static boolean isBalance(TreeNode root) {
		// write code here
		if(root == null)
		{
			return true;
		}
		int left = height(root.left);
		int right = height(root.right);
		if(Math.abs(left - right) <= 1)
		{
			boolean leftChild = isBalance(root.left);
			boolean rightChild = isBalance(root.right);
			return leftChild && rightChild;
		}
		else {
			return false;
		}
		
		
	}
	public static int height(TreeNode root)
	{
		if(root != null)
			return Math.max(height(root.left),height(root.right)) + 1;
		else
			return 0;
	}
	public static TreeNode createBiTree(TreeNode root, int[] a, int i)
	{
		if(i < a.length)
		{
			if(a[i] == 0)
			{
				return null;
			}
			TreeNode leftChild = new TreeNode();
			TreeNode rightChild =  new TreeNode();
			root.val = a[i];
			root.left = createBiTree(leftChild, a, ++counter);
			root.right = createBiTree(rightChild, a, ++counter);
		}
		return root;
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode();
        int[] a = {1, 0, 0};//{ 1, 2, 3, 0, 0, 4, 0, 0, 5, 0, 0 };
        root = createBiTree(root, a, counter);
        System.out.println(isBalance(root));
	}
}
/*
 * ʵ��һ�����������������Ƿ�ƽ�⣬ƽ��Ķ������£��������е�����һ����㣬�����������ĸ߶Ȳ����1��
����ָ����������ָ��TreeNode* root���뷵��һ��bool������������Ƿ�ƽ�⡣
 * */
