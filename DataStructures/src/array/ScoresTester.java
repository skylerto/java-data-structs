package array;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ScoresTester {

	static Scores array;

	@BeforeClass
	public static void testsetup() {
		array = new Scores();
		for (int i = 1; i < array.maxEntries + 1; i++) {
			GameEntry e = new GameEntry("Skyler" + i, i * 100);
			array.add(e);
		}
	}

	@Test
	public void testToString() {
		assertEquals(
				"Should give string rep",
				array.toString(),
				"[Skyler10- 1000, Skyler9- 900, Skyler8- 800, Skyler7- 700, Skyler6- 600, Skyler5- 500, Skyler4- 400, Skyler3- 300, Skyler2- 200, Skyler1- 100]");
	}

}
