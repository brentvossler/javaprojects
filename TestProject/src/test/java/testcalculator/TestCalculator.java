package testcalculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;

public class TestCalculator {

	Calculator calculator;
	
	@Before
	public void setup() {
		//arrange
		calculator = new Calculator();
	}
	
	@Test
	public void doesCalculatorWhenGivenTwoPlusThreeEqualFive() {
				
		//act
		int answer = calculator.add(2, 3);
		
		//assert
		assertEquals(5, answer);
	}
	
	@Test
	public void doesCalculatorWhenGivenThreeAndFourEqualSeven() {
						
		//act
		int answer = calculator.add(3, 4);
		
		//assert
		assertEquals(7, answer);
	}

	@Test
	public void dowsCalculatorWhenGivenThreeAndFourEqualTwelve() {
						
		//act
		int answer = calculator.add(3, 4, 5);
		
		//assert
		assertEquals(12, answer);
	}
}
