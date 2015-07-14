package array;

/**
 * A game entry object for a specific user and their high score.
 * 
 * This example is taken from Data Structures and Algorithms In Java 5th
 * Edition.
 * 
 * @author Skyler
 * @version 1.0
 */
public class GameEntry {

	private String name;
	private int highScore;

	/**
	 * Constructs a new game entry.
	 * 
	 * @param name
	 *            - players name
	 * @param highScore
	 *            - score they received.
	 */
	public GameEntry(String name, int highScore) {
		this.name = name;
		this.highScore = highScore;
	}

	/**
	 * Get's the players high score.
	 * 
	 * @return highScore.
	 */
	public int getHighScore() {
		return highScore;
	}

	/**
	 * Get's the players name.
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns a String representation of the game entry.
	 * @return 
	 */
	public String toString() {
		return name + "- " + highScore;
	}

}
