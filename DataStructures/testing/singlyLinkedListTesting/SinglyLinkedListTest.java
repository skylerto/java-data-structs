package singlyLinkedListTesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import singlyLinkedList.SinglyLinkedList;

public class SinglyLinkedListTest {

	private SinglyLinkedList list;

	@Before
	public void setUp() throws Exception {
		list = new SinglyLinkedList();
	}

	@After
	public void tearDown() throws Exception {
		list = null;
	}

	/**
	 * Test the add method.
	 */
	@Test
	public void testAddLast() {
		assertEquals(0, list.size());
		list.addLast("Skyler");
		assertEquals(1, list.size());
		list.addLast("Christopher");
		assertEquals(2, list.size());
		list.addLast("Layne");
		assertEquals(3, list.size());
	}

	/**
	 * Tests the remove first method.
	 */
	@Test
	public void testRemoveFirst() {
		list.add("Layne");
		list.add("Skyler");
		assertEquals("Skyler", list.removeFirst());
	}

	/**
	 * Tests the toString method.
	 */
	@Test
	public void testToString() {
		list.add("Skyler");
		list.add("Christopher");
		list.add("Layne");
		assertEquals("[Layne, Christopher, Skyler]", list.toString());
	}

}
