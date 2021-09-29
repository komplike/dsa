package pr04;

import java.util.Vector;

public class Node {
	private String name;
	private Vector<Node> nodes = new Vector<>();
	
	public Node() {
		
	}
	
	public Node(String name) {
		this.name = name;
	}
	
	public void addNode(Node next) {
		nodes.add(next);
	}
	
	public Node getNode(int idx) {
		return nodes.get(idx);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void printNodes() {
		for (Node node : nodes) {
			System.out.println(this.name+"->"+node);
		}
	}
}
