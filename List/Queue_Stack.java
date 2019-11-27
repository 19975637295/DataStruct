package List;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Stack {
	
}
class Stack_use_Queue{
	Queue<Integer> queue;
	Queue<Integer> help;
	public Stack_use_Queue() {
		queue = new LinkedList<>();
		help = new LinkedList<>();
	}
	public void push(int item) {
		queue.add(item);
	}
	public int pop() {
		if(queue.isEmpty())
			throw new RuntimeException("队列为空");
		while(queue.size()>1)
			help.add(queue.poll());
		swap();
		return help.poll();
	}
	public int peek() {
		if(queue.isEmpty())
			throw new RuntimeException("队列为空");
		while(queue.size()>1)
			help.add(queue.poll());
		int res = queue.poll();
		help.add(res);
		swap();
		return res;
	}
	public void swap() {
		Queue<Integer> q;
		q = queue;
		queue = help;
		help = q;
	}
}

class Queue_use_Stack{
	
}