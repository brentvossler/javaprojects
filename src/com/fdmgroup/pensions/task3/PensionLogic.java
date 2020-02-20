package com.fdmgroup.pensions.task3;

public class PensionLogic {

	public boolean isPensionable(Person person, String year) {
				
		String str[] = person.getDateOfBirth().split("/");
		int dobYear = Integer.parseInt(str[2]);
		int retYear = Integer.parseInt(year);
		if ((retYear - dobYear) >= 65) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
