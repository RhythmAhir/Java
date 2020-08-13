package userRegistrationSystem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class RegistrationControllerTest {

	@Mock
    FileReadCommand mockReadCommand;
    @Mock
    FileWriteCommand mockWriteCommand;
    @Mock
    User user;
    @Mock
    RegistrationController mockRegistrationController;
    @Mock
    UserFactory userFactory;
    @Before
    public void setUpClass() {   
        MockitoAnnotations.initMocks(this);   
    }
 
    @Test
    public void test_readUser_of_FileReadCommandInTheRegisterNewUserMethod() throws Exception{
        RegistrationController controller = new RegistrationController();
        controller.setReadCommand(mockReadCommand);
        controller.setWriteCommand(mockWriteCommand);
        controller.registerNewUser("test", "test", "test");
        Mockito.verify(mockReadCommand, Mockito.times(1)).readUser("test");
    }
    
    @Test
    public void test_writeUser_of_FileReadCommandInTheRegisterNewUserMethod() throws Exception{
    	RegistrationController controller = new RegistrationController();
        controller.setWriteCommand(mockWriteCommand);
        controller.setReadCommand(mockReadCommand);
        Mockito.when(userFactory.createUser("username", "password", "role")).thenReturn(user);
        controller.registerNewUser("username", "password", "role");
        Mockito.verify(mockWriteCommand, Mockito.times(1)).writeUser(any(User.class));
    }
    

	@Test
    public void test_FileWriterWritingNewUser() {
        FileReadCommand fileReadCommand = new FileReadCommand();
        FileWriteCommand fileWriteCommand = new FileWriteCommand();
        UserFactory factory = new UserFactory();
 
        User newUser = factory.createUser("username", "password", "role");
        fileWriteCommand.writeUser(newUser);
        User actual = fileReadCommand.readUser("username");
        String newUsrStr = newUser.toString();
        String actualUsr = actual.toString();
        assertEquals(newUsrStr, actualUsr);
    }
  
    
    
}

