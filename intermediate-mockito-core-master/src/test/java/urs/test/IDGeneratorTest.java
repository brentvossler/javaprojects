package urs.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import urs.registration.IDGenerator;

public class IDGeneratorTest {

	private IDGenerator idGen;

	@Before
	public void setUp() throws Exception {
		idGen = new IDGenerator();
	}

	@Test
	public void testFirstTimeGetNextValReturns1() {
		// arrange
		// act
		int result = idGen.getNextVal();
		// assert
		assertEquals(1, result);
	}

	@Test
	public void testSecondTimeGetNextValReturns1MoreThanFirstTime() {
		// arrange
		// act
		int result1 = idGen.getNextVal();
		int result2 = idGen.getNextVal();
		int difference = result2 - result1;
		// assert
		assertEquals(1, difference);
		assertEquals(2, result2);
	}

	@Test
	public void testTwoGeneratorsStartWithSameNumber() {
		// arrange
		IDGenerator idGen2 = new IDGenerator();
		// act
		int result1 = idGen.getNextVal();
		int result2 = idGen2.getNextVal();
		// assert
		assertEquals(result1, result2);
	}

}
