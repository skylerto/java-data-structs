package linkedList;

public class LinkedList implements List {

	Node head;
	Node tail;
	int size;

	/**
	 * Constructor of the linked list.
	 */
	public LinkedList() {
		head = new Node(null, null, null);
		tail = new Node(null, null, null);
		size = 0;
	}

	@Override
	public void addAfter(Node addAfter, String data) {
		if(size == 0){
			throw new NullPointerException("Empty List!");
		} else {
			
		}

	}

	@Override
	public void addFirst(String element) {
		// TODO Auto-generated method stub

	}

	/**
	 * Adds to the end of a double linked list.
	 */
	@Override
	public void addLast(String element) {
		Node toAdd = new Node(element, null, null);
		if (size == 1) {
			head.setNext(toAdd); // Set the header's next to point to the new
									// node.
			toAdd.setPrev(head); // Set the new nodes prev to point to the head.
			toAdd.setNext(tail); // Set the new nodes next to point to the tail.
			tail.setPrev(toAdd); // Set the tail's prev to point to the new
									// node.
			size++;
		} else {
			Node previous = this.tail.prev().prev();
			previous.setNext(toAdd); // Set the previously last node to point to
										// the new node.
			toAdd.setNext(tail); // Set the new node's next to point to the
									// tail.
			toAdd.setPrev(previous); // Set the new Node's previous to point to
										// the previously last node.
			tail.setPrev(toAdd); // Set the tail's previous to point to the new
									// node.
			size++;
		}
	}

	@Override
	public String removeFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the last element in the list.
	 */
	@Override
	public String removeLast() {
		if (size == 0) {
			throw new NullPointerException("List is empty!");
		} else {
			Node previous;
			if (size == 1)
				previous = this.head;
			else
				previous = this.tail.prev().prev(); // Get the element

			Node toRemove = this.tail.prev(); // data of element to be removed.
			previous.setNext(tail); // Set the new last elements next to tail.
			tail.setPrev(previous); // Set the tail's previous to the new last.
			toRemove.setNext(null); // Set the node to be removed's next to
									// null.
			toRemove.setPrev(null); // Set the node to be removed's previous to
									// null
			size--;
			return toRemove.getElement();
		}

	}
	
	@Override
	public String remove(Node toRemove){
		
	}

	@Override
	public int indexOf(String element) {
		// TODO Auto-generated method stub
		return 0;
	}

}