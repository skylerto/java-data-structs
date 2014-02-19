package queue;

/**
 * Deals with when a queue is empty.
 * 
 * @author Skyler
 * @version 1.0
 */
public class EmptyQueueException extends RuntimeException {

	public EmptyQueueException(String err) {
		super(err);
	}

}
