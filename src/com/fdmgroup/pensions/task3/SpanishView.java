package com.fdmgroup.pensions.task3;

public class SpanishView implements View {

	public void printEligible(Person person) {
		System.out.println(person.getFirstName() + " es elegible para una pensi�n.");
	}
	
	public void printIneligible(Person person) {
		System.out.println(person.getFirstName() + " a�n no tiene la edad suficiente.");
	}

}
