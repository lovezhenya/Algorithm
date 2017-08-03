package programmer.demo;

import java.util.Scanner;

/* @author  作者 E-mail: * @date 创建时间：2017年7月14日 下午12:20:26 * @version 1.0 * @parameter  * @since  * @return  */
public class ListKElement {

	public ListKElement() {
		// TODO Auto-generated constructor stub
	}

	public static int n;

	public static ListNode findK(ListNode head, int k) {
		if (k == 0)
			return null;
//		这里要判断k的合法性
		if (head == null)
			return null;
		ListNode p = findK(head.next, k);
		n++;
		if (n == k) {
			p = head;
			return p;
		}
		return p;
	}

	public static int listLength(ListNode head) {
		ListNode temp = head;
		if(head == null)
			return 0;
		int length = 0;
		while(temp != null)
		{
			length++;
			temp = temp.next;
		}
		System.out.println(length+ " rwqer");
		return  length;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ListNode node1 = new ListNode();
		node1.val = sc.nextInt();
		ListNode nodetemp1 = node1;
		for(int i = 0; i < 3; i++)
		{
			ListNode n1 = new ListNode();
			n1.val = sc.nextInt();
			nodetemp1.next = n1;
			nodetemp1 = nodetemp1.next;
		}
//		System.out.println(findK(node1, 4).val);
		ListNode p = findK(node1, 4);
		while(p != null)
		{
			System.out.println(p.val);
			p = p.next;
		}
	}
}
