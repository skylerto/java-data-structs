package queue;

/**
 * Interface of the FIFO data structure queue.
 * 
 * @author Skyler
 * @version 1.0
 * @param <E>
 *            type of the queue.
 */
public interface Queue<E> {

	/**
	 * Adds a element to the read of a queue.
	 * 
	 * @param e
	 *            - Element to be added to the queue.
	 */
	public void enqueue(E e);

	/**
	 * Returns the first element in the queue.
	 * 
	 * @return - Element at the front of the queue.
	 * @throws EmptyQueueException
	 *             when queue is empty.
	 */
	public Object dequeue() throws EmptyQueueException;

	/**
	 * Returns the size of the queue.
	 * 
	 * @return size - size of the queue.
	 */
	public int size();

	/**
	 * Checks if the queue is empty.
	 * 
	 * @return false if the queue contains elements.
	 */
	public boolean isEmpty();

	/**
	 * Returns the first element in the queue without removing it.
	 * 
	 * @return the first element in the queue.
	 * @throws EmptyQueueException
	 *             if the queue is empty.
	 */
	public Object front() throws EmptyQueueException;
}
