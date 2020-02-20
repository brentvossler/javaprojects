package urs.registration;

import urs.dataaccess.ReadCommand;
import urs.dataaccess.WriteCommand;

public class RegistrationController {

	private ReadCommand reader;

	private WriteCommand writer;

	private UserFactory factory;

	private ValidationService service;

	public RegistrationController(ReadCommand reader, WriteCommand writer, UserFactory factory,
			ValidationService service) {
		this.reader = reader;
		this.writer = writer;
		this.factory = factory;
		this.service = service;
	}

	public boolean registerNewUser(String username, String password, String role) {
		if ((!service.roleIsValid(role)) ||
				(!service.passwordIsValid(password)) || 
				(!service.usernameIsValid(username))) {
			return false;
		}
		User found = reader.readUser(username);
		if (found == null) {
			User newUser = factory.createUser(username, password, role);
			writer.writeUser(newUser);
			return true;
		} else {
			return false;
		}
	}

}
