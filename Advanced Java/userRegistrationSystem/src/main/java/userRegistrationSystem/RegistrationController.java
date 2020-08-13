package userRegistrationSystem;

public class RegistrationController {
	private FileReadCommand readCommand;
	private FileWriteCommand writeCommand;
	private UserFactory userFactory;
	
	
	public void setReadCommand(FileReadCommand readCommand) {
		this.readCommand = readCommand;
	}
	
	public void setWriteCommand(FileWriteCommand writeCommand) {
		this.writeCommand = writeCommand;
	}
	
	public FileReadCommand getReadCommand() {
		return readCommand;
	}

	public FileWriteCommand getWriteCommand() {
		return writeCommand;
	}
	
	public void registerNewUser(String username, String password, String role) throws Exception {
		//initialize factory
		userFactory = new UserFactory();
		//get a user from the factory
        User user = userFactory.createUser(username, password, role);

        if(getReadCommand().readUser(username) == null) {
            getWriteCommand().writeUser(user);
        }
        else {
            throw new Exception("The username: "  + username + " User Already exists");
        }
    }

	
}
