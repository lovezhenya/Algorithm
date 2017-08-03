package programmer.demo;

import java.util.ArrayList;

/* @author  作者 E-mail: * @date 创建时间：2017年7月16日 上午11:40:52 * @version 1.0 * @parameter  * @since  * @return  */
public class TreeLevel {

	public TreeLevel() {
		// TODO Auto-generated constructor stub
	}

	public static ListNode getTreeLevel(TreeNode root, int dep) {
		// write code here
		if(root == null) 
			return null;
		ListNode lNode = new ListNode();
		TreeLevel(root, dep, 1);
		if(list.size() == 1)
			return list.get(0);
		if (list.size() == 0)
			return null;
		lNode = list.get(0);
		ListNode ln = lNode;
		for (int i = 1; i < list.size(); i++) {
			ln.next = list.get(i);
			ln = ln.next;
		}
		return lNode;
	}
static ArrayList<ListNode> list = new ArrayList();
	public static void TreeLevel(TreeNode root, int dep, int curdep) {
		// write code here
		if (dep == 0)
			return;
		if (curdep == dep) {
			ListNode lNode = new ListNode();
			lNode.val = root.val;
			list.add(lNode);
		}
		if(root.left != null)
			TreeLevel(root.left, dep, curdep + 1);
		if(root.right != null)
			TreeLevel(root.right, dep, curdep + 1);
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode();
		int dep = 4;
		ListNode result = getTreeLevel(root, dep);
		while(result != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}
}
