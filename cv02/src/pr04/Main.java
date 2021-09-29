package pr04;

public class Main {
	public static void main(String[] args) {
		Node n1 = new Node("adresar1");
		Node n2 = new Node("adresar2");
		Node n3 = new Node("adresar3");
		Node n4 = new Node("adresar4");
		Node n5 = new Node("adresar5");
		Node n6 = new Node("adresar6");
		
		
		n1.addNode(n2);
		n1.addNode(n4);
		n1.addNode(n5);
		n1.addNode(n6);
		
		n2.addNode(n1);
		n2.addNode(n3);
		n2.addNode(n5);
		
		n5.addNode(n4);
		
		n1.printNodes();
		n2.printNodes();
		n3.printNodes();
	}
}
