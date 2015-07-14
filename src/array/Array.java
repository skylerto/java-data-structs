package array;

/**
 * Interface of the methods needed for the class Scores, an array representation
 * of GameEntry.
 * 
 * @author Skyler
 * @version 1.0
 */
public interface Array {

	/**
	 * Add a GameEntry into the array.
	 * 
	 * @param e
	 *            - Element to be added.
	 */
	public void add(GameEntry e);

	/**
	 * Remove an entry from the array
	 * 
	 * @param index
	 *            - index of the object to be removed.
	 * @return
	 */
	public GameEntry remove(int index);

	/**
	 * Return a string representation of the array.
	 * 
	 * @return - String version of array.
	 */
	public String toString();

	/**
	 * Compares two elements returns true if they're equal.
	 * 
	 * @param a
	 *            - First element to compare.
	 * @param b
	 *            - Second element to compare.
	 * @return
	 */
	public boolean equals(GameEntry a, GameEntry b);
}
