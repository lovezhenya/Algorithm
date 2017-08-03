package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月14日 下午4:14:35 * @version 1.0 * @parameter  * @since  * @return  */
public class ListPalindrome {

	public ListPalindrome() {
		// TODO Auto-generated constructor stub
	}
	public static boolean isPalindrome(ListNode pHead) {
        // write code here
		ListNode temp = pHead;
		if(pHead == null)
			return false;
		int length = 0;
		while(temp != null)
		{
			length++;
			temp = temp.next;
		}
		Result result = isPalindrome(pHead, length);
		return result.result;
    }
	public static Result isPalindrome(ListNode pHead, int length)
	{
		if(pHead == null || length == 0)
			return new Result(null, true);
		if(length == 1)
			return new Result(pHead.next, true);
		if(length == 2)
		{
			if(pHead.val == pHead.next.val)
				return new Result(pHead.next.next, true);
			else {
				return new Result(pHead, false);
			}
		}
		Result result = isPalindrome(pHead.next, length - 2);
		if(result.result == false || result.node == null)
		{
			return result;
		}
		else {
				return new Result(result.node.next, pHead.val == result.node.val);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ListNode node1 = new ListNode();
		node1.val = sc.nextInt();
		ListNode nodetemp1 = node1;
		for(int i = 0; i < 5; i++)
		{
			ListNode n1 = new ListNode();
			n1.val = sc.nextInt();
			nodetemp1.next = n1;
			nodetemp1 = nodetemp1.next;
		}
		boolean val = isPalindrome(node1);
		System.out.println(val);
	}
}
class Result{
	public ListNode node;
	public boolean result;
	public Result(ListNode node, boolean result) {
		super();
		this.node = node;
		this.result = result;
	}
	
}
