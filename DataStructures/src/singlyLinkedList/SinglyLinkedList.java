package singlyLinkedList;

/**
 * 
 * Class to represent a singly linked list.
 * 
 * @author Skyler
 * @version 1.0
 * @param <E>
 */
public class SinglyLinkedList<E> {

	Node head;
	int size;

	/**
	 * default constructor
	 */
	public SinglyLinkedList() {
		size = 0;
		head = new Node(null, null);
	}

	/**
	 * Adds an element to the end of the list.
	 * 
	 * @param toAdd
	 *            - Element to be added to the list.
	 */
	public void addLast(String toAdd) {
		if (size == 0) {
			this.head.setElement(toAdd);
			size++;
		} else {
			Node newNode = new Node(toAdd, null);
			getCurrentLast().setNext(newNode);
			size++;
		}
	}

	public void add(String toAdd) {

		if (size == 0) {
			this.head.setElement(toAdd); // set the heads data to be the passed
											// data.
			size++;
		} else {
			Node newNode = new Node(toAdd, head); // Create a new node
													// pointing to the
													// current head.
			this.head = newNode; // set the new head to be equal to the new
									// node.
			size++;
		}
	}

	/**
	 * Removes from the front of the list.
	 * 
	 * @return
	 */
	public Object removeFirst() {

		if (this.head.getElement() == null) {
			throw new NullPointerException();
		}
		Node oldHead = this.head; // Create a node to hold the data from the
									// head node.
		this.head = this.head.next(); // Set this head to the next element.
		oldHead.setNext(null);
		return oldHead.getElement();
	}

	/**
	 * toString representation of SinglyLinkedList.
	 */
	public String toString() {

		String rep = "[";
		Node curr = this.head;
		for (int i = 0; i < size(); i++) {

			if (curr != null) {
				if (i >= 1) {
					rep += ", ";
				}
				rep += curr.getElement();
				curr = curr.next();
			}
		}
		return rep + "]";
	}

	public int size() {
		return this.size;
	}

	private Node getCurrentLast() {
		Node curr = this.head;
		while (curr.next() != null) {
			curr = curr.next();
		}
		return curr;
	}

}
