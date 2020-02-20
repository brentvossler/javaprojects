package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.PigLatinTranslator;

class PigLatinTranslatorTest {

	PigLatinTranslator translator;
	
	@BeforeEach
	public void Setup() {
	translator = new PigLatinTranslator();
	}
	
	@Test
	void pigLatinTakesInStringaAndReturnString() {
		//arrange
		String oldString = "charlie";
		
		//act
		Object newString = translator.translate(oldString);
		//assert
		assertTrue(newString instanceof String);
		
	}
	
	@Test
	void pigLatinTakesInStringAndTranslatesStringAndReturnsFirstLetter() {
		//arrange
		String oldString = "charlie";
		
		//act
		String newString = translator.getFirstCharacter(oldString);
		
		//assert
		assertEquals("c", newString);
	}
	
	@Test
	void pigLatinTakesInStringAndCreatesEnd() {
		//arrange
		String oldString = "c";
		
		//act
		String newString = translator.createEndString("c");
		
		//assert
		assertEquals("-cay", newString);
	}
	
	@Test
	void pigLatinTakesInStringAndTransformsWord() {
		//arrange
		String oldString = "charlie";
		
		//act
		String newString = translator.translate(oldString);
		
		//assert
		assertEquals("harlie-cay", newString);
	}
	
	@Test
	void pigLatinTakesInStringBeginningWithVowelAndTranslates() {
		//arrange
		String oldString = "apple";
		
		//act
		String newString = translator.translate(oldString);
		
		//assert
		assertEquals("apple-way", newString);	
	}

}
