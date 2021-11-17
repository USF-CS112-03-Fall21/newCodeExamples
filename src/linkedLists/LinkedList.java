package linkedLists;

public class LinkedList {
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void insertAtFront(int elem) {
		Node newNode = new Node(elem);
		newNode.setNext(head);
		head = newNode;
		
	}

	public void append(int elem) {
		// FILL IN CODE
	}

	public int remove(Node prevNode) {
		if (prevNode == null || prevNode.getNext() == null) {
			//throw new InvalidArgumentException();
			System.out.println("No node to delete");
			return Integer.MIN_VALUE;
		}
		Node nodeToDelete = prevNode.getNext();
		int deletedElem = nodeToDelete.getElem();
		prevNode.setNext(nodeToDelete.getNext());
		return deletedElem;
	}

	public void print() {
		// FILL IN CODE
		
	}
}
