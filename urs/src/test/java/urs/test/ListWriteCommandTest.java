package urs.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import urs.dataaccess.ListWriteCommand;
import urs.registration.User;

public class ListWriteCommandTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWriteUserActuallyWriteTheUser() {
		// Arrange
		List<User> users = new ArrayList<>();
		User mockUser = Mockito.mock(User.class);
		ListWriteCommand writer = new ListWriteCommand(users);
		// Act
		int size1 = users.size();
		writer.writeUser(mockUser);
		int size2 = users.size();
		int difference = size2 - size1;
		// Assert
		assertEquals(1, difference);
	}

}
