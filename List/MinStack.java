package List;

import java.util.Stack;
//leetcode 115
public class MinStack {
	Stack<Integer> stack;
	Stack<Integer> min_stack;
	public MinStack() {
		stack = new Stack<>();
		min_stack = new Stack<>();
	}
	public Integer getMin() throws Exception {
		if(min_stack.isEmpty())
			throw new Exception("Õ»Îª¿Õ");
		return min_stack.peek();
	}
	public Integer pop() throws Exception{
		if(stack.isEmpty()) {
			throw new Exception("Õ»Îª¿Õ");
		}
		if(stack.peek()==min_stack.peek()) {
			min_stack.pop();
		}
		return stack.pop();
	}
	public void push(int value) {
		if(min_stack.isEmpty()) {
			min_stack.push(value);
		}
		stack.push(value);
		if(value<min_stack.peek())
			min_stack.push(value);
	}
}
