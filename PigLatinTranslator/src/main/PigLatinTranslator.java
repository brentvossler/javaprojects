package main;

public class PigLatinTranslator {

	public String translate(String word) {
		String restOfWord = word.substring(1);
		String firstLetter = getFirstCharacter(word);
		
		if (firstLetter.matches("[aeiou]")) {
			return word + "-way";
		}
		
		String endOfString = createEndString(firstLetter);
		return restOfWord + endOfString;
	}

	public String getFirstCharacter(String word) {
		return word.substring(0, 1);
	}

	public String createEndString(String beginningLetter) {
		return "-" + beginningLetter + "ay";
	}

}
