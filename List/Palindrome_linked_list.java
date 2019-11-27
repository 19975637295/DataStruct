package List;

import java.util.Stack;

public class Palindrome_linked_list {
	public static void solution(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode cur = head;
		while(head!=null) {
			stack.push(cur);
			cur = cur.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
