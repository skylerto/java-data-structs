package singlyLinkedList;

/**
 * 
 * A class to represent nodes in a linked list, using generics.
 * 
 * @author Skyler
 * @version 1.0
 */
public class Node<E> {

	private E data;
	private Node next;

	/**
	 * default constructor.
	 * 
	 * @param element
	 *            - Data to store.
	 * @param next
	 *            - Next node.
	 */
	public Node(E element, Node next) {
		this.data = element;
		this.next = next;
	}

	/**
	 * Returns the nodes data.
	 * 
	 * @return data - data stored in element.
	 */
	public Object getElement() {
		return this.data;
	}

	/**
	 * Returns the next node.
	 * 
	 * @return next - the next node.
	 */
	public Node next() {
		return next;
	}

	/**
	 * Sets the nodes data.
	 * 
	 * @param newData
	 *            - Sets the nodes data.
	 */
	public Object setElement(E newData) {
		this.data = newData;
		return data;
	}

	/**
	 * Sets the next node.
	 * 
	 * @param nextElement
	 *            - sets the nodes next element.
	 */
	public void setNext(Node nextElement) {
		this.next = nextElement;
	}

	public String toString() {
		String rep = "" + data;
		return rep;
	}

}
