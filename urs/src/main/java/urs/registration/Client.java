package urs.registration;

public class Client {

	public static void main(String[] args) {

		// Make everything else
		ValidationService v = new ValidationService();
		ConsoleService c = new ConsoleService(v);

		boolean exit = false;
		while (!exit) {

			String username = c.inputValidation("Please enter new username: ", "username");
			String password = c.inputValidation("Please enter new password: ", "password");
			String role = c.inputValidation("Please enter new role: ", "role");

			// rc.registerNewUser(username, password, role);

			exit = c.checkExit();

		}

	}

}
