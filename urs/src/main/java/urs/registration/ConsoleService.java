package urs.registration;

import java.util.Scanner;

public class ConsoleService {

	private ValidationService v;

	@SuppressWarnings("resource")
	private Scanner s;

	public ConsoleService(ValidationService v) {
		this.v = v;
		s = new Scanner(System.in);
	}

	public String inputValidation(String prompt, String type) {
		String input = null;
		boolean fail = true;
		while (fail) {
			System.out.print(prompt);
			input = s.nextLine();
			if (inputIsValidForType(type, input)) {
				fail = false;
			} else {
				System.out.println("Invalid input");
			}
		}
		System.out.println("You entered: " + input);
		return input;
	}

	private boolean inputIsValidForType(String type, String input) {
		boolean isValid = false;
		switch (type.toLowerCase()) {
		case ("username"):
			isValid = v.usernameIsValid(input);
			break;
		case ("password"):
			isValid = v.passwordIsValid(input);
			break;
		case ("role"):
			isValid = v.roleIsValid(input);
			break;
		default:
			System.out.println("Invalid input type, please try again");
			throw new IllegalArgumentException();
		}
		return isValid;
	}

	public boolean checkExit() {
		while (true) {
			System.out.println("Add another user? (y/n");
			String input = s.nextLine().toLowerCase();
			if (input.equals("n")) {
				return true;
			} else if (input.equals("y")) {
				return false;
			} else {
				System.out.println("Please enter just a 'y' or an 'n'");
			}
		}
	}

}
