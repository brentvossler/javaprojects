package testEvenOdd;

import static org.junit.Assert.*;


import org.junit.Test;

import evenOdd.EvenOdd;

public class TestEvenOdd {

EvenOdd evenOdd;
		
	@Test
	public void testEven() {
		//arrange
		evenOdd = new EvenOdd();
				
		//act
		String answer = evenOdd.odd_or_even(2, 2);
		
		//assert
		assertEquals("even", answer);
	}
	
	@Test
	public void testOdd() {
		//arrange
		evenOdd = new EvenOdd();
				
		//act
		String answer = evenOdd.odd_or_even(1, 2);
		
		//assert
		assertEquals("odd", answer);
	}
	
	@Test
	public void testEmpty() {
		//arrange
		evenOdd = new EvenOdd();
				
		//act
		String answer = evenOdd.odd_or_even();
		
		//assert
		assertEquals("even", answer);
	}

}
