package com.fdmgroup.pensions.task3;

public class PensionController {
	
	PensionLogic logic;
	View view;

	public PensionController(PensionLogic logic, View view) {
		this.logic = logic;
		this.view = view;
	}

	public void handlePensions(Person[] people) {
		
		String retirementYear = "2014";
		for (Person peeps: people) {
			if (logic.isPensionable(peeps, retirementYear)) {
				view.printEligible(peeps);
			}
			else {
				view.printIneligible(peeps);
			}
						
		}
	}
	
	
	
}
