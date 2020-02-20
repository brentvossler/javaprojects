package urs.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import urs.registration.ValidationService;

public class ValidationServiceTest {

	private ValidationService service;

	@Before
	public void setUp() throws Exception {
		service = new ValidationService();
	}

	@Test
	public void testUsernameIsValidReturnsFalseIfUsernameHasSpaces() {
		// Arrange
		String username = " ";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testUsernameIsValidReturnsTrueIfUsernameHasNoSpaces() {
		// Arrange
		String username = "bobIsRobert";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testUsernameIsValidReturnsFalseIfUsernameHasLessThanEightCharacters() {
		// Arrange
		String username = "bob";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testUsernameIsValidReturnsTrueIfUsernameHasMoreThanEightCharacters() {
		// Arrange
		String username = "bobIsRobert";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testUsernameIsValidReturnsTrueIfUsernameHasEightCharacters() {
		// Arrange
		String username = "bobIsRob";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testUsernameIsValidReturnsFalseIfUsernameHasSpecialChars() {
		// Arrange
		String username = "bob@Robert";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testUsernameIsValidReturnsTrueIfUsernameHasNoSpecialChars() {
		// Arrange
		String username = "bobIsRobert";
		// Act
		boolean result = service.usernameIsValid(username);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testPasswordIsValidReturnsTrueIfPasswordHasMoreThanEightCharactersAndOneSpecialChar() {
		// Arrange
		String password = "password!23";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testPasswordIsValidReturnsFalseIfPasswordHasMoreThanEightCharactersAndNoSpecialChar() {
		// Arrange
		String password = "password123";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testPasswordIsValidReturnsTrueIfPasswordHasMoreThanEightCharactersAndMultipleSpecialChar() {
		// Arrange
		String password = "password!#3";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testPasswordIsValidReturnsTrueIfPasswordHasEightCharactersAndOneSpecialChar() {
		// Arrange
		String password = "passw!23";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testPasswordIsValidReturnsFalseIfPasswordHasEightCharactersAndNoSpecialChar() {
		// Arrange
		String password = "passw123";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testPasswordIsValidReturnsTrueIfPasswordHasEightCharactersAndMultipleSpecialChar() {
		// Arrange
		String password = "passw!#3";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testPasswordIsValidReturnsFalseIfPasswordHasLessThanEightCharactersAndOneSpecialChar() {
		// Arrange
		String password = "pass!23";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testPasswordIsValidReturnsFalseIfPasswordHasLessThanEightCharactersAndNoSpecialChar() {
		// Arrange
		String password = "pass123";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testPasswordIsValidReturnsFalseIfPasswordLessThanEightCharactersAndMultipleSpecialChar() {
		// Arrange
		String password = "pass!#3";
		// Act
		boolean result = service.passwordIsValid(password);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testRoleIsValidReturnsTrueIfGivenUser() {
		// Arrange
		String role = "user";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertTrue(result);
	}


	@Test
	public void testRoleIsValidReturnsTrueIfGivenAdmin() {
		// Arrange
		String role = "admin";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void testRoleIsValidReturnsFalseIfGivenNotUserOrAdmin() {
		// Arrange
		String role = "notuseroradmin";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertFalse(result);
	}
	
	@Test
	public void testRoleIsValidReturnsTrueIfGivenCapitalUser() {
		// Arrange
		String role = "USER";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertTrue(result);
	}


	@Test
	public void testRoleIsValidReturnsTrueIfGivenCapitalAdmin() {
		// Arrange
		String role = "ADMIN";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertTrue(result);
	}
	
	@Test
	public void testRoleIsValidReturnsFalseIfGivenSpaces() {
		// Arrange
		String role = " ";
		// Act
		boolean result = service.roleIsValid(role);
		// Assert
		assertFalse(result);
	}
	
}
