package com.fdmgroup.collections;
import java.util.ArrayList;
import java.util.HashSet;
	
public class DuplicateWords {
		
	String[] sentenceArray;
	int numOfDupes = 0;
	
	public DuplicateWords(String sentence) {
		
		sentenceArray = sentence.toLowerCase().split(" ");
		
		HashSet<String> dupeSet = new HashSet<>();
		
		for (int i = 0; i < sentenceArray.length; i++) {
		    if (dupeSet.add(sentenceArray[i])) {
		        //System.out.println(dupeSet);
		    }  
		    else {
		        numOfDupes = numOfDupes + 1;
		    }
		}
	}
	
		public int getDuplicateWords() {
		return numOfDupes;
	}

	
}
