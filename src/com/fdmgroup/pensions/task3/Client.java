package com.fdmgroup.pensions.task3;

public class Client {

	public static void main(String[] args) {

		Person person1 = new Person();
			person1.setFirstName("John");
			person1.setLastName("Smith");
			person1.setDateOfBirth("28/06/1993");
			
		Person person2 = new Person();
			person2.setFirstName("Jane");
			person2.setLastName("Doe");
			person2.setDateOfBirth("05/01/1950");
		
		Person person3 = new Person();
			person3.setFirstName("Fred");
			person3.setLastName("Bloggs");
			person3.setDateOfBirth("12/12/1949");
			
		//create an array of Person Objects called people
		Person[] people = {person1, person2, person3};
		
		// Instantiation of controller obj
		View view = new SpanishView();
		PensionLogic logic = new PensionLogic();
		PensionController controller = new PensionController(logic, view);
				
		// pass array to the handlePensions methods of controller obj
		controller.handlePensions(people);
		
		

	}

}
