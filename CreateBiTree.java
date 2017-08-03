package programmer.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* @author  作者 E-mail: * @date 创建时间：2017年7月15日 上午10:39:34 * @version 1.0 * @parameter  * @since  * @return  */
public class CreateBiTree {

	public CreateBiTree() {
		// TODO Auto-generated constructor stub
	}

	static int counter = 0;

	public static TreeNode createBiTree(TreeNode root, int[] a, int i) {
		if (i < a.length) {
			if (a[i] == 0) {
				return null;
			}
			TreeNode leftChild = new TreeNode();
			TreeNode rightChild = new TreeNode();
			root.val = a[i];
			root.left = createBiTree(leftChild, a, ++counter);
			root.right = createBiTree(rightChild, a, ++counter);
		}
		return root;
	}

	public static void levelTraverse(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);// 从根节点入队列
		while (!queue.isEmpty()) {// 在队列为空前反复迭代
			TreeNode bitNode = queue.poll();// 取出队列首节点
			visitTNode(bitNode);
			if (bitNode.left != null)
				queue.offer(bitNode.left);// 左孩子入列
			if (bitNode.right != null)
				queue.offer(bitNode.right);// 右孩子入列
		}
	}

	public static void visitTNode(TreeNode node) {
		System.out.print(node.val + " ");
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
	static ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
	static ArrayList<Integer> lisst = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		if(root != null)
		{
			if(root.left == null && root.right == null)
			{
				if (root.val == target) {
					lisst.add(root.val);
					solution.add(lisst);
					return solution;
				}
			}
			lisst.add(root.val);
			FindPath(root.left, target - root.val);
			FindPath(root.right, target-root.val);
		}
		return solution;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode();
		int[] a = {1,1,3,7,0,0,7,0,0,4,9,0,0,10,0,0,2,5,11,0,0,12,0,0,6,13,0,0,14,0,0};
		root = createBiTree(root, a, counter);
		 //levelTraverse(root);
//		int dep = 1;
//		ListNode result = getTreeLevel(root, dep);
//		while (result != null) {
//			System.out.print(result.val + " ");
//			result = result.next;
//		}
		ArrayList<ArrayList<Integer>> solution = FindPath(root, 12);
		for(int i = 0; i < solution.size(); i++) 
		{
			for(int j = 0; j < solution.get(i).size(); j++)
			{
				System.out.print(solution.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}

/*
 * 
 * private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
 * 
 * */
