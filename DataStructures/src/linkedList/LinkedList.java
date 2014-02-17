package linkedList;

public class LinkedList implements List {

	private class Node<E> {

		private Node<?> next;
		private Node<?> prev;
		private E data;

		private Node(E dataEle, Node<?> nextEle, Node<?> prevEle) {
			this.next = nextEle;
			this.prev = prevEle;
			this.data = dataEle;
		}
	}

	Node head;

	/**
	 * Constructor of the linked list.
	 */
	public LinkedList() {

	}

	@Override
	public void add(Object element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object element) {
		// TODO Auto-generated method stub
		return 0;
	}

}