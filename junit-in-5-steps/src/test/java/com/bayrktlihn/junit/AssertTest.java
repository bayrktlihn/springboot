package com.bayrktlihn.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void test() {
		assertEquals(3, 3);
		assertTrue(true);
		assertFalse(false);
		assertNotNull(23);
		assertNull(null);
	}

}
