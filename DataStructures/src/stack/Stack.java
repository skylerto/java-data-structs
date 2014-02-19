package stack;

/**
 * A stack interface.
 * 
 * Initialize size to be -1.
 * 
 * @author Skyler
 * @version 1.0
 * @param <E>
 *            - Generic type of the stack.
 */
public interface Stack<E> {

	/**
	 * Adds element e to the top of the stack.
	 * 
	 * @param e
	 *            - Element to push onto the stack.
	 */
	public void push(E e);

	/**
	 * Pops the first element off the stack
	 * 
	 * @return e - Element from the stack.
	 * @exception EmptyStackException
	 *                if stack is empty.
	 */
	public E pop() throws EmptyStackException;

	/**
	 * Returns the size of the stack.
	 * 
	 * @return size - the size of the stack.
	 */
	public int size();

	/**
	 * Boolean if the list is empty or not.
	 * 
	 * @return empty - true or false if the stack is empty.
	 */
	public boolean isEmpty();

	/**
	 * Returns the top element on the stack without removing.
	 * 
	 * @return e - Element on top of stack.
	 * @exception EmptyStackException
	 *                if stack is empty.
	 */
	public E top() throws EmptyStackException;
}
