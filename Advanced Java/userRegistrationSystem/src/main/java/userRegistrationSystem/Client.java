package userRegistrationSystem;

public class Client {
	public static void main(String[] args) throws Exception {
		
		FileReadCommand readCommand = new FileReadCommand();
		FileWriteCommand writeCommand = new FileWriteCommand();
		RegistrationController controller = new RegistrationController();
		controller.setReadCommand(readCommand);
		controller.setWriteCommand(writeCommand);
		controller.registerNewUser("RhythmAhir", "password", "QATester");
		controller.registerNewUser("Alex", "1234", "Trainer");
		System.out.println(controller.getReadCommand().readUser("RhythmAhir"));
		System.out.println(controller.getReadCommand().readUser("Alex"));
	}
}
