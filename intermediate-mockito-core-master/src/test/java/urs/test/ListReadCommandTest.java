package urs.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import urs.dataaccess.ListReadCommand;
import urs.registration.User;

class ListReadCommandTest {
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testListReadCommandReturnsNullIfUserNotFound() {
		//arrange
		ListReadCommand listReadCommand = new ListReadCommand();
		String username = "joe";
		//act
		User result = listReadCommand.readUser(username);
		//assert
		assertNull(result);
	}
	
	@Test
	void testListReadCommandReturnsUserIfUserFound() {
		//arrange
		ListReadCommand listReadCommand = new ListReadCommand();
		String username = "joe";
		//act
		User result = listReadCommand.readUser(username);
		//assert
		assertNotNull(result);
	}
}
