package array;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class GameEntryTester {

	static GameEntry entry;

	@BeforeClass
	public static void testsetup() {
		String name = "Skyler";
		int highscore = 100;
		entry = new GameEntry(name, highscore);
	}

	@Test
	public void testName() {
		assertEquals("Should give my name", entry.getName(), "Skyler");
	}

	@Test
	public void testScore() {
		assertEquals("Should give highscore", entry.getHighScore(), 100);
	}

	@Test
	public void testToString() {
		assertEquals("Test toString", entry.toString(), "Skyler- 100");
	}

}
