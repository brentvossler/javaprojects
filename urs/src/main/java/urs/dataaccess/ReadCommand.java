package urs.dataaccess;

import urs.registration.User;

public interface ReadCommand {

	User readUser(String username);

}
