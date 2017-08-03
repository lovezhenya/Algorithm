package programmer.demo;
/* @author  ���� E-mail: * @date ����ʱ�䣺2017��7��17�� ����10:59:27 * @version 1.0 * @parameter  * @since  * @return  */
public class FindSuccOfSubSeq {

	public FindSuccOfSubSeq() {
		// TODO Auto-generated constructor stub
	}
	static TreeNode prev = null;
	public int findSucc(TreeNode root, int p) {
        // write code here
		if(root == null)
			return -1;
		int left = findSucc(root.left, p);
		if(prev != null && prev.val == p)
		{
			prev = null;
			return root.val;
		}
		prev = root;
		int right = findSucc(root.right, p);
		if(left >= 0)
			return left;
		else if(right >= 0)
			return right;
		else
			return -1;
    }

}
