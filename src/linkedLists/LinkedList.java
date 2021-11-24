package linkedLists;

public class LinkedList {
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	public LinkedList(Node head) {
		this.head = head;
		// TODO: need to set the tail

	}
	
	public void insertAtFront(int elem) {
		Node newNode = new Node(elem);
		newNode.setNext(head);
		head = newNode;
		// TODO: handle the tail

		
	}

	public void append(int elem) {
        Node newNode = new Node(elem);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.setNext(newNode);
            tail = newNode;
        }
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

	/** Prints the elements of the linked list */
	public void print() {
	    Node curr = head;
	    while (curr != null) {
            System.out.println(curr.getElem());
            curr = curr.getNext();
        }
    }



    public int getFirstValueLargerThan(int elem) {
	    // Assume the list is sorted in increasing order
        // Return the first element that is larger than elem
        Node curr = head;
        while (curr != null && (curr.getElem() < elem)) {

            curr = curr.getNext();
        }
        return curr.getElem();


    }

    public int getLargestValueSmallerThan(int elem) {
        // Assume the list is sorted in increasing order
        // Return the largest value smaller than elem

        // TODO
        return 0;


    }

    public void insert(int index, int elem) {
	    // Insert a new node with the given element at the given index
        // TODO

    }

    public void removeNode(Node node) {
        // Write a method that deletes the given node from the linked list;
        // The reference to the previous node is NOT given!
        // TODO

    }


    public int getHeadValue() {
	    return head.getElem();
    }

    public int getTailValue() {
        return tail.getElem();
    }
}
