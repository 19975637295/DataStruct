package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GrapgUtil {
	public static void BFS(Node node) {
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		HashSet<Node> hadseen = new HashSet<>();
		queue.add(node);
		System.out.print(node.val);
		while(!queue.isEmpty()) {
			Node cur = queue.poll();
			for(Node n: cur.nexts) {
				if(!hadseen.contains(n)) {
					hadseen.add(n);
					queue.add(n);
				}	
			}
		}
	}
}
