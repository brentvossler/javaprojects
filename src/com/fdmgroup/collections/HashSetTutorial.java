package com.fdmgroup.collections;

import java.util.HashSet;

public class HashSetTutorial {

	public static void main(String[] args) {
		
		HashSet<Integer> integers = new HashSet<>();
        integers.add(5);
        integers.add(10);
        integers.add(0);
        integers.add(-1);
        integers.add(-22234);
        System.out.println(integers);
        
	}
}
