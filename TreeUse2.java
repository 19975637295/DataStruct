import java.util.Stack;

public class TreeUse2 {
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
	}
	public static void mirros(TreeNode root) {
		TreeNode cur = root;
		while(cur!=null) {
			if(cur.left==null)
				cur = cur.right;
			else {
				TreeNode cur2 = cur.left;
				boolean changed = false;
				while(cur2.right!=null) {
					if(cur2.right==cur) {
						cur2.right=null;
						cur = cur.right;
						changed=true;
						break;
					}
					cur =cur.right;
				}
				if(!changed) {
					cur2.right=cur;
					cur = cur.left;
				}
			}
		}
	}
	public static void pre(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			System.out.print(cur.data);
			if(cur.right!=null) {
				stack.push(cur.right);
			}
			if(cur.left!=null) {
				stack.push(cur.left);
			}
		}
	}
	public static void inorder(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		TreeNode cur = root;
		while(!stack.isEmpty()||cur!=null) {
			if(cur!=null) {
				stack.push(cur.left);
				cur = cur.left;
			}else {
				cur = stack.pop();
				System.out.print(cur.data);
				cur = cur.right;
			}
		}
	}
	public static void post(TreeNode root) {
		if(root==null)
			return;
		Stack<TreeNode> stack = new Stack<>();
		Stack<TreeNode> res = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			res.push(cur);
			if(cur.left!=null) {
				stack.push(cur.left);
			}
			if(cur.right!=null) {
				stack.push(cur.right);
			}
		}
		while(!res.isEmpty()) {
			System.out.print(res.pop().data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
