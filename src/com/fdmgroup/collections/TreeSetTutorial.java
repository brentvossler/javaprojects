package com.fdmgroup.collections;

import java.util.TreeSet;

public class TreeSetTutorial {

	public static void main(String[] args) {
		
		TreeSet<Integer>integers = new TreeSet<>();
        integers.add(5);
        integers.add(10);
        integers.add(0);
        integers.add(-1);
        // below is not added because you can't have duplicates
        integers.add(5);
        System.out.println("Original set: " + integers);
        
	}

}
