package userRegistrationSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadCommand implements ReadCommand {

	public User readUser(String username) {
		// TODO Auto-generated method stub
		User newUser = null;
		Scanner scanner;
		//check if the UserFiles exists
		try {
			File file = new File("Users.txt");
			if (!file.exists()) { try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			scanner = new Scanner(new FileReader("Users.txt"));
			
			while (scanner.hasNextLine()) {
				String[] line = scanner.nextLine().split(" ");
				String usrname = line[0].substring(0, line[0].length() - 1);
				String password = line[1].substring(0, line[1].length() - 1);
				String role = line[2];
				if (usrname.equals(username)) {
					newUser = new User(usrname, password, role);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newUser;
	}
}
