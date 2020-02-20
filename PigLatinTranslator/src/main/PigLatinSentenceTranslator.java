package main;

public class PigLatinSentenceTranslator {
	
	private PigLatinTranslator personalTranslator;
	
	public PigLatinSentenceTranslator(PigLatinTranslator translator) {
		personalTranslator = translator;
	}
	
	public String translateSentence(String string) {
		String[] array = string.split(" ");
		String finalWord = "";
		for (String word : array) {
			finalWord += personalTranslator.translate(word);
		}
		return finalWord.trim();
		
		
	}
}
