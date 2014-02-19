package linkedList;

public interface List {

	// Add the element.
	public void addLast(String element);

	// Add after specific node.
	public void addAfter(Node addAfter, String data);

	// Add the element.
	public void addFirst(String element);

	// Remove the first element.
	public String removeFirst();

	// Remove the last element.
	public String removeLast();

	// Remove the specific node.
	public String remove(Node toRemove);

	// Index of node.
	public int indexOf(String element);
}
