package urs.dataaccess;

import java.util.List;

import urs.registration.User;

public class ListReadCommand implements ReadCommand {

	private List<User> users;

	public ListReadCommand(List<User> users) {
		this.users = users;
	}

	@Override
	public User readUser(String username) {
		username = username.toLowerCase();
		for (User user : users) {
			String result = user.getUsername();
			result = result.toLowerCase();
			if (username.equals(result)) {
				return user;
			}
		}
		return null;
	}

}
