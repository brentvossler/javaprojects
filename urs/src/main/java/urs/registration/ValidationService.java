package urs.registration;

public class ValidationService {

	public boolean usernameIsValid(String username) {
		if ((username.length() < 8) || (!username.matches("[a-zA-Z0-9]*"))) {
			return false;
		} else {
			return true;
		}
	}

	public boolean passwordIsValid(String password) {
		if ((password.length() < 8) || (password.matches("[a-zA-Z0-9]*"))) {
			return false;
		} else {
			return true;
		}
	}

	public boolean roleIsValid(String role) {
		role = role.toLowerCase();
		if (role.equals("user") || role.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}

}
