package linkedList;

public interface List<E> {
	
	// Add the element
	public void add(E element);
	
	// Remove the element
	public E remove(int index);
	
	// Index of node
	public int indexOf(E element);
}
