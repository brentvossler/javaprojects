package urs.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import urs.registration.IDGenerator;
import urs.registration.User;
import urs.registration.UserFactory;

public class UserFactoryTest {

	private UserFactory factory;

	private IDGenerator mockIdGen;

	private String username;

	private String password;

	private String role;

	@Before
	public void setUp() throws Exception {
		username = "bob";
		password = "abc";
		role = "admin";
		mockIdGen = Mockito.mock(IDGenerator.class);
		factory = new UserFactory(mockIdGen);
	}

	@Test
	public void testCreateUserDoesNotReturnNull() {
		// Arrange
		// Act
		User result = factory.createUser("", "", "");
		// Assert
		assertNotNull(result);
	}

	@Test
	public void testCreateUserCreatesAUserWithTheGivenUserInfo() {
		// Arrange
		// Act
		User result = factory.createUser(username, password, role);
		// Assert
		assertEquals(username, result.getUsername());
		assertEquals(password, result.getPassword());
		assertEquals(role, result.getRole());
	}

	@Test
	public void testCreateUserUsesIDGenerator() {
		// arrange
		// act
		User result = factory.createUser(username, password, role);
		// assert
		Mockito.verify(mockIdGen).getNextVal();
	}

	@Test
	public void testCreateUserProducesUsersWithDifferentIDsEachTime() {
		// arrange
		Mockito.when(mockIdGen.getNextVal()).thenReturn(1).thenReturn(2);
		// act
		User result1 = factory.createUser(username, password, role);
		User result2 = factory.createUser(username, password, role);
		int id1 = result1.getId();
		int id2 = result2.getId();
		// assert
		assertNotEquals(id1, id2);
	}

}
