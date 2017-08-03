package programmer.demo;
/* @author  作者 E-mail: * @date 创建时间：2017年7月15日 下午5:28:07 * @version 1.0 * @parameter  * @since  * @return  */
public class CheckBiTree {

	public CheckBiTree() {
		// TODO Auto-generated constructor stub
	}
	public boolean checkBST(TreeNode root) {
        // write code here
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	public boolean checkBST(TreeNode root, int min, int max) {
        // write code here
		if(root == null)
			return true;
		if(root.val < min || root.val >=max)
			return false;
		return checkBST(root.left, min, root.val) && checkBST(root.right, root.val, max);
    }
}
