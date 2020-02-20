package com.fdmgroup.collections;

import java.util.HashMap;

public class HashMapTutorial {

	public static void main(String[] args) {
		
		HashMap<Integer, String> testHashMap = new HashMap<>();
		System.out.println(testHashMap.isEmpty());
		testHashMap.put(-55, "brent");
		testHashMap.put(2, "alex");
		testHashMap.put(1, "dude");
		testHashMap.put(8, null);
		System.out.println(testHashMap);
		testHashMap.remove(1);
		System.out.println(testHashMap.remove(1));
		System.out.println(testHashMap);
	}
}
