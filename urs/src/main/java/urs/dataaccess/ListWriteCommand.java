package urs.dataaccess;

import java.util.List;

import urs.registration.User;

public class ListWriteCommand implements WriteCommand {

	private List<User> users;

	public ListWriteCommand(List<User> users) {
		this.users = users;
	}

	@Override
	public void writeUser(User user) {
		users.add(user);
	}

}
