package com.fdmgroup.collections;

import java.util.LinkedHashMap;

public class StringOccurance {

	LinkedHashMap<Character, Integer> occur = new LinkedHashMap<>();
	
	public StringOccurance(String str) {
		
		for (char c : str.toCharArray()) {
			System.out.println(c);
			System.out.println(occur);
			if (occur.containsKey(c)) {
				if (occur.get(c) != null) {
					occur.replace(c, occur.get(c), occur.get(c)+1);
				}
			}	
			else {
				occur.put(c, 1);
			}
		}
	}
	
	public LinkedHashMap<Character, Integer> getOccurances() {
		return occur;
	}
}

