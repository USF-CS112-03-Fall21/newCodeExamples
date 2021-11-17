package linkedLists;

public class Node {
	private int elem;
	private Node next;
	
	Node(int elem) {
		this.elem = elem;
		next = null;
	}

	Node (int elem, Node next) {
		this.elem = elem;
		this.next = next;
	}


	public Node getNext() {
		return next;
	}
	public int getElem() {
		return elem;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
