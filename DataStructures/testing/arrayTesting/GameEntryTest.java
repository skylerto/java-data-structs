package arrayTesting;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import array.GameEntry;

public class GameEntryTest {

	private GameEntry entry;
	int i = new Random().nextInt();;
	String name = "Skyler";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		entry = new GameEntry(name, i);
	}

	@After
	public void tearDown() throws Exception {
		entry = null;
	}

	/**
	 * Tests get high score
	 */
	@Test
	public void testGetHighScore() {
		assertEquals(i, entry.getHighScore());
	}

	/**
	 * Tests get name.
	 */
	@Test
	public void testGetName() {
		assertEquals(name, entry.getName());
	}

	/**
	 * Tests to string.
	 */
	@Test
	public void testToString() {
		assertEquals(name + "- " + i, entry.toString());
	}

}
