package urs.registration;

public class UserFactory {

	private IDGenerator idGen;

	public UserFactory(IDGenerator idGen) {
		this.idGen = idGen;
	}

	public User createUser(String username, String password, String role) {
		int id = idGen.getNextVal();
		return new User(id, username, password, role);
	}

}
