package com.fdmgroup.collections;

import java.util.TreeSet;
public class Tutorial {

	public static void main(String[] args) {
		
	// 1.
	//COLLECTIONS - Collections are like containers that 
	//group multiple items in a single unit
	
	//LISTS: Same element can occur more than once and has order
	//(http://tutorials.jenkov.com/java-collections/list.html#java-list-tutorial-video)
	//	LinkedList: Every element is linked to previous and next element
	// 		(https://www.baeldung.com/java-linkedlist)
	//	ArrayList:  Provides random access to elements by index values
	
	//SETS: Same element cannot occur more than once and no promise of order
	//	TreeSet:It doesn't preserve the insertion order of the elements,
	//			It sorts the elements in ascending order
	// 	HashSet:It stores unique elements and permits nulls
	//			It's backed by a HashMap
	//			It doesn't maintain insertion order
	//	EnumSet:
	//	LinkedHashSet:
	
	//MAPS: A map is a key-value mapping, which means that every key is 
	// 		mapped to exactly one value and that we can use the key to 
	//		retrieve the corresponding value from a map
	//	TreeMap:Sorts all its entries according to their natural ordering
	//	HashMap:Cannot assume order when iterating. 
	//	ConcurrentSkipListMap:
	//	LinkedHashMap:
	//	EnumMap:
	
	//QUEUES:
	
	// SORTING: 
	// how does a class know about sorting order. comparable/comparator.
	// https://dzone.com/articles/how-to-sort-objects-in-java
		
	
	// 2. --------------------------------------------------------
		System.out.println("**** QUESTION 2 ****");
		TreeSet<String>names = new TreeSet<>();
		names.add("Brent");
		names.add("Doug");
		names.add("Joe");
		names.add("Joe");
		// below is not added because you can't have duplicates
		names.add("Doug");
		System.out.println(names);
	
	// 3. --------------------------------------------------------
	// Colors: RED , GREEN , BLUE , MAGENTA , CYAN , YELLOW , 
	// BLACK , WHITE , GRAY , DARK_GRAY, LIGHT_GRAY , ORANGE , and PINK
		
		System.out.println("**** QUESTION 3 ****");
		ColorMap colorMap = new ColorMap();
		colorMap.getColorMap("Blue");
		colorMap.getAllColors();
	// 4. --------------------------------------------------------
		
		System.out.println("**** QUESTION 4 ****");
		StringOccurance occurances = new StringOccurance("abcdefgggg");
		System.out.println(occurances.getOccurances());
		
	// 5. --------------------------------------------------------

		System.out.println("**** QUESTION 5 ****");
		DuplicateWords mySentence = new DuplicateWords("i am a sentence with duplicate words and I am a duplicate sentence");
		System.out.println("There are " + mySentence.getDuplicateWords() + " duplicate words in your sentence.");
		
	// 6. --------------------------------------------------------
		System.out.println("**** QUESTION 6 ****");
		
	}
	
}

