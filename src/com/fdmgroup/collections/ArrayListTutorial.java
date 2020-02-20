package com.fdmgroup.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTutorial {

	public static void main(String[] args) {

		ArrayList<Object> listTest = new ArrayList<>();
		listTest.add("first item");
		listTest.add("second item");
		listTest.add("third item");
		listTest.add(7);

		Iterator<Object> it = listTest.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//.add .get .remove
		//listTest.remove(0);
		//System.out.println(listTest.get(2));
		//System.out.println(listTest);

	}
}
