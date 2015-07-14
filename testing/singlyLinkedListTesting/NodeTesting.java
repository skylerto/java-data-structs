package singlyLinkedListTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import singlyLinkedList.Node;

public class NodeTesting {

	private Node tester;

	@Before
	public void setUp() throws Exception {
		tester = new Node("Skyler", null);
	}

	@After
	public void tearDown() throws Exception {
		tester = null;
	}

	/**
	 * Tests the getElement method in Node.
	 */
	@Test
	public void testGetElement() {
		assertEquals("Skyler", tester.getElement());
	}

	/**
	 * Tests the setElement method in Node.
	 */
	@Test
	public void testSetElement() {
		assertEquals("SkylerLayne", tester.setElement("SkylerLayne"));
	}

	/**
	 * Tests the toString method in Node.
	 */
	@Test
	public void testToString() {
		assertEquals(tester.getElement(), tester.toString());
	}

}
