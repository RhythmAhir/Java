package userRegistrationSystem;

public class UserFactory {
	
	public User createUser(String username, String password, String role) {
		User newUser = new User(username, password, role);
		return newUser;
	}
}
