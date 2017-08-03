package programmer.demo;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

/* @author  作者 E-mail: * @date 创建时间：2017年7月18日 上午11:53:38 * @version 1.0 * @parameter  * @since  * @return  */
public class BiTreePathOfSum {

	public BiTreePathOfSum() {
		// TODO Auto-generated constructor stub
	}


	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<>();
		if(root.left == null && root.right == null)
		{
			if (root.val == target) {
				list.add(root.val);
				solution.add(list);
				return solution;
			}
		}
		list.add(root.val);
		solution = FindPath(root.left, target - root.val);
		solution = FindPath(root.right, target-root.val);
		return solution;
	}

//	public int Sum(TreeNode root, int target, ArrayList<Integer> list) {
//		if (root.left == null && root.right == null) {
//			if (target - root.val == 0) {
//				list.add(root.val);
//				return 1;
//			}
//			else {
//				return -1;
//			}
//		}
//		list.add(root.val);
//		int sumleft = Sum(root.left, target - root.val, list);
//		int sumright = Sum(root.right, target - root.val, list);
//	}
}
