package programmer.demo;

import java.util.Hashtable;
import java.util.Scanner;
class ListNode1 {
    int val;
    ListNode1 next = null;

    ListNode1(int val) {
        this.val = val;
    }
}
public class DeleteDups {

	public DeleteDups() {
		// TODO Auto-generated constructor stub
	}
	public static void DeleteDups(ListNode1 node)
	{
		if(node == null)
		{
			return ;
		}
		Hashtable table = new Hashtable();
		ListNode1 preNode = node;
		while(node != null)
		{
			if(!table.containsKey(node.val))
			{
				table.put(node.val, true);
				preNode = node;
			}else {
				preNode.next = node.next;
			}
			node = node.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ListNode1 node = new ListNode1(5);
		ListNode1 nextNode = node;
		for(int i = 0; i < 5; i++)
		{
			int val = sc.nextInt();
			ListNode1 n = new ListNode1(val);
			nextNode.next = n;
			nextNode = nextNode.next;
		}
		DeleteDups(node);
		while(node != null)
		{
			System.out.println(node.val);
			node = node.next;
		}
	}
}
