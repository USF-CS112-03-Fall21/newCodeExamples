package linkedLists;

public class Node {
	private int elem;
	private Node next;
	
	public Node(int elem) {
		this.elem = elem;
		next = null;
	}

	public Node (int elem, Node next) {
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

    public void setElem(int elem) {
        this.elem = elem;
    }
}
