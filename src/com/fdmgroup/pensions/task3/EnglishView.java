package com.fdmgroup.pensions.task3;

public class EnglishView implements View {

	public void printEligible(Person person) {
		System.out.println(person.getFirstName() + " is eligible for a pension.");
	}
	
	public void printIneligible(Person person) {
		System.out.println(person.getFirstName() + " is not old enough yet.");
	}

	
}
