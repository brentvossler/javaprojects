package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.PigLatinSentenceTranslator;
import main.PigLatinTranslator;
import static org.mockito.Mockito.*;

class PigLatinSentenceTranslatorTest {

	PigLatinTranslator translator;
	PigLatinSentenceTranslator sentenceTranslator;
	
	@BeforeEach 
	public void setup(){
		translator = mock(PigLatinTranslator.class);
		sentenceTranslator = new PigLatinSentenceTranslator(translator);
	}
	
	
	@Test
	void pigLatinSentenceTranslatorCallsUponPigLatinTranslatorOnce() {
		//arrange
		PigLatinTranslator translator = mock(PigLatinTranslator.class);
		
		//act
		PigLatinSentenceTranslator sentenceTranslator = new PigLatinSentenceTranslator(translator);
		sentenceTranslator.translateSentence("fish");
		
		//assert
		verify(translator, times(1)).translate("fish");
		
	}
	
	@Test
	void pigLatinSentenceTranslatorGetsChangedWordFromPigLatinTranslator() {
		//arrange
		PigLatinTranslator translator = mock(PigLatinTranslator.class);
		PigLatinSentenceTranslator sentenceTranslator = new PigLatinSentenceTranslator(translator);
		
		
		//act
		when(translator.translate("fish")).thenReturn("ish-fay");
		String result = sentenceTranslator.translateSentence("fish");

		
		//assert
		assertEquals("ish-fay", result);
	}
	
	@Test
	void pigLatinSentenceTranslatorWhenGivenMultipleWordsCallsTranslatorMultipleTimes() {
		sentenceTranslator.translateSentence("fish fish fish");
		verify(translator, times(3)).translate("fish");
	}

}
