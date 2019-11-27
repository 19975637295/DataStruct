package graph;

import java.util.ArrayList;

public class Node {
	int val;
	int in;
	int out;
	ArrayList<Node> nexts = new ArrayList<>();
	ArrayList<edge> edges = new ArrayList<>();
	public Node(int val) {
		this.val = val;
		in = 0;
		out = 0;
	}
}
