package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��15�� ����5:28:07 * @version 1.0 * @parameter  * @since  * @return  */
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
