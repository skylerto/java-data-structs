package stack;

/**
 * 
 * Exception to deal with an empty stack.
 * 
 * @author Skyler
 * @version 1.0
 */
public class EmptyStackException extends RuntimeException {

	public EmptyStackException(String err) {
		super(err);
	}
}
