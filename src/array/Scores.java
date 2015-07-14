package array;

/**
 * 
 * @author Skyler
 * @version 1.0
 */
public class Scores implements Array {

	public static final int maxEntries = 10;
	protected int numbEntries;
	protected GameEntry[] entries;

	/**
	 * default constructor.
	 * 
	 */
	public Scores() {
		entries = new GameEntry[maxEntries];
		numbEntries = 0;
	}

	/**
	 * Returns a string representation of the high scores array.
	 */
	public String toString() {

		String s = "[";

		if (numbEntries >= 0) {

			for (int i = 0; i < numbEntries; i++) {
				if (i > 0) {
					s += ", ";
				}
				s += entries[i];
			}

		}

		return s + "]";
	}

	/**
	 * Add an element to the array. In descending order.
	 * 
	 * @param e
	 *            - Element to be added.
	 */
	@Override
	public void add(GameEntry e) {

		int newScore = e.getHighScore();

		if (numbEntries == maxEntries) { // array is full
			if (newScore <= entries[numbEntries - 1].getHighScore()) {
				return; // To small to add to the array.
			}

		} else { // Array is not full.
			numbEntries++; // increase the number of entries.
			int i = numbEntries - 1;
			if (i == 0) {
				entries[0] = e;
			} else {
				for (; (i > 0) && (newScore >= entries[i - 1].getHighScore()); i--) {

					entries[i] = entries[i - 1]; // shift the array one to the
													// right.
				}
				entries[i] = e; // add the element to the correct position.

			}
		}
	}

	/**
	 * Remove an element from the array at a specific index.
	 * 
	 * @param index
	 *            - index of element to be removed
	 * @return e - Element to be removed.
	 * @exception - Throws IndexOutOfBoundsException if the index is less than 0
	 *            or greater than the number of entries.
	 */
	public GameEntry remove(int index) throws IndexOutOfBoundsException {
		// Check if the passed index is valid.
		if (index < 0 || index > numbEntries) {
			throw new IndexOutOfBoundsException("invalid index" + index);
		}
		GameEntry e = entries[index]; // Get the element at the desired
										// location.
		for (int i = index; i < numbEntries; i++) {
			entries[i] = entries[i + 1]; // Move all the elements to the left.
		}
		entries[numbEntries - 1] = null; // Set the last element to be null.
		numbEntries--; // Decrease the number of entries by 1.
		return e;
	}

	public static void main(String[] args) {
		Scores array = new Scores();
		GameEntry entry = new GameEntry("Skyler", 500);
		array.add(entry);

		GameEntry entry1 = new GameEntry("Skyler", 1000);
		array.add(entry1);

		GameEntry entry2 = new GameEntry("Skyler", 0);
		array.add(entry2);
		System.out.println(array.toString());
		GameEntry e = array.remove(1);
		System.out.println(e.toString());
		System.out.println(array.toString());
	}

	@Override
	public boolean equals(GameEntry a, GameEntry b) {
		if ((a.getName() == b.getName())
				&& (a.getHighScore() == b.getHighScore()))
			return true;
		else
			return false;
	}

}
