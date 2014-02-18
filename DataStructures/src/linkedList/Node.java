package linkedList;

/**
 * 
 * A class to represent a node in a doubly linked list.
 * 
 * @author Skyler
 * @version 1.0
 */
public class Node {

	private String data;
	private Node next;
	private Node prev;

	/**
	 * default constructor.
	 * 
	 * @param element
	 *            - Data to store.
	 * @param next
	 *            - Next node.
	 */
	public Node(String element, Node prev, Node next) {
		this.data = element;
		this.prev = prev;
		this.next = next;
	}

	/**
	 * Returns the nodes data.
	 * 
	 * @return data - data stored in element.
	 */
	public String getElement() {
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
	 * Returns the prev node.
	 * 
	 * @return
	 */
	public Node prev() {
		return prev;
	}

	/**
	 * Sets the nodes data.
	 * 
	 * @param newData
	 *            - Sets the nodes data.
	 */
	public String setElement(String newData) {
		this.data = newData;
		return data;
	}

	/**
	 * Sets the prev node.
	 * 
	 * @param prevElement
	 *            - Sets the nodes previous element
	 */
	public void setPrev(Node prevElement) {
		this.prev = prevElement;
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
