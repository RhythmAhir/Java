package userRegistrationSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCommand implements WriteCommand {

	public void writeUser(User user) {
		// TODO Auto-generated method stub
		try {
			
            String data = user.toString() + "\n";

            File file = new File("Users.txt");
            if (!file.exists()) { file.createNewFile();}

            FileWriter fileWritter = new FileWriter(file.getName(), true);
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
