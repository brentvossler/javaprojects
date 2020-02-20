package urs.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import urs.dataaccess.ListReadCommand;
import urs.registration.User;

public class ListReadCommandTest {

	private ListReadCommand reader;

	private User mockUser;
	private List<User> users;

	@Before
	public void setUp() throws Exception {
		mockUser = Mockito.mock(User.class);
		Mockito.when(mockUser.getUsername()).thenReturn("bob");
		users = new ArrayList<>();
		users.add(mockUser);
		reader = new ListReadCommand(users);
	}

	@Test
	public void testReadUserReturnsUserIfUsernameFound() {
		// arrange
		String username = "bob";
		// act
		User result = reader.readUser(username);
		// assert
		assertNotNull(result);
	}

	@Test
	public void testReadUserReturnsUserIfUsernameFoundWithCase() {
		// arrange
		String username = "BOB";
		// act
		User result = reader.readUser(username);
		// assert
		assertNotNull(result);
	}

	@Test
	public void testReadUserReturnsNullIfUsernameNotFound() {
		// arrange
		String username = "notBob";
		// act
		User result = reader.readUser(username);
		// assert
		assertNull(result);
	}

	@Test
	public void testReadUserReturnsCorrectUserIfUsernameFound() {
		// arrange
		String username = "bob";
		// act
		User result = reader.readUser(username);
		String resultName = result.getUsername();
		// assert
		assertEquals(username, resultName);
	}
	
	@Test
	public void testReadUserReturnsCorrectUserIfUsernameFoundWithCase() {
		// arrange
		String username = "BOB";
		// act
		User result = reader.readUser(username);
		String resultName = result.getUsername();
		username = username.toLowerCase();
		resultName = resultName.toLowerCase();
		// assert
		assertEquals(username, resultName);
	}

}
