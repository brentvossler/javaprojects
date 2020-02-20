package urs.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import urs.dataaccess.ReadCommand;
import urs.dataaccess.WriteCommand;
import urs.registration.RegistrationController;
import urs.registration.User;
import urs.registration.UserFactory;
import urs.registration.ValidationService;

public class RegistrationControllerTest {

	private RegistrationController rc;

	private ReadCommand mockReader;

	private UserFactory mockFactory;

	private WriteCommand mockWriter;

	private ValidationService mockService;

	private User mockUser;

	private String username;

	private String password;

	private String role;

	@Before
	public void setUp() throws Exception {
		mockUser = Mockito.mock(User.class);
		mockReader = Mockito.mock(ReadCommand.class);
		mockWriter = Mockito.mock(WriteCommand.class);
		mockFactory = Mockito.mock(UserFactory.class);
		mockService = Mockito.mock(ValidationService.class);
		rc = new RegistrationController(mockReader, mockWriter, mockFactory, mockService);
		username = "bob";
		password = "password!";
		role = "user";
	}

	@Test
	public void testRegisterNewUserUsesReadCommand() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(true);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		Mockito.verify(mockReader).readUser(username);

		// Stubbing: when(method).thenReturn(something)
		// Verifying: verify(object).method
	}

	@Test
	public void testRegisterNewUserUsesUserFactory() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(true);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		Mockito.verify(mockFactory).createUser(username, password, role);
	}

	@Test
	public void testRegisterUserReturnsTrueIfUserNotFound() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(true);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		assertTrue(result);
	}

	@Test
	public void testRegisterNewUserReturnsFalseIfUserFound() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(true);
		Mockito.when(mockReader.readUser(username)).thenReturn(mockUser);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		assertFalse(result);
	}

	@Test
	public void testRegisterNewUserUsesWriteCommandIfUserNotFound() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(true);
		Mockito.when(mockFactory.createUser(username, password, role)).thenReturn(mockUser);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		Mockito.verify(mockWriter).writeUser(mockUser);
	}

	@Test
	public void testRegisterNewUserDoesNotUseWriteCommandIfUserFound() {
		// Arrange
		Mockito.when(mockReader.readUser(username)).thenReturn(mockUser);
		// Act
		boolean result = rc.registerNewUser(username, "", "");
		// Assert
		Mockito.verify(mockWriter, Mockito.times(0)).writeUser(mockUser);
	}

	@Test
	public void testRegisterNewUserUsesValidationServiceToValidateUsername() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.passwordIsValid(password)).thenReturn(true);
		// Act
		boolean result = rc.registerNewUser(username, password, role);
		// Assert
		Mockito.verify(mockService).usernameIsValid(username);
	}

	@Test
	public void testRegisterNewUserReturnsFalseIfUsernameIsNotValid() {
		// Arrange
		String invalidUsername = "a bob@r";
		// Act
		boolean result = rc.registerNewUser(invalidUsername, "", "");
		// Assert
		assertFalse(result);
	}

	@Test
	public void testRegisterNewUserUsesValidationServiceToValidatePassword() {
		// Arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		// Act
		boolean result = rc.registerNewUser("", password, role);
		// Assert
		Mockito.verify(mockService).passwordIsValid(password);
	}

	@Test
	public void testRegisterNewUserReturnsFalseIfPasswordIsNotValid() {
		// Arrange
		String invalidPassword = "pass123";
		// Act
		boolean result = rc.registerNewUser("", invalidPassword, "");
		// Assert
		assertFalse(result);
	}

	@Test
	public void testRegisterNewUserUsesValidationServiceToValidateRole() {
		// arrange
		Mockito.when(mockService.roleIsValid(role)).thenReturn(true);
		Mockito.when(mockService.usernameIsValid(username)).thenReturn(false);
		// act
		boolean result = rc.registerNewUser(username, password, role);
		// assert
		Mockito.verify(mockService).roleIsValid(role);
	}

}
