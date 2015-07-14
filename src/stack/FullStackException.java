package stack;

/**
 * If the value in the array is > 1000 (Array capacity).
 * 
 * @author Skyler
 * @version 1.0
 */
public class FullStackException extends RuntimeException {

	public FullStackException(String err) {
		super(err);
	}
}
