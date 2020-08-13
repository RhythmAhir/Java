import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;



public class CatalogueTest {
    
    @Mock
	static
    ReadItemCommand mockReadItem;
    
    @Before
    public void setupClass()
    {
   mockReadItem = Mockito.mock(ReadItemCommand.class);

    }
 

    @Test
    public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
        //Arrange
        Catalogue catalogue = new Catalogue();
        catalogue.setReadItemCommand(mockReadItem);
        
        //Act
        List<Book> bookList = catalogue.getAllBooks();
        
        //Assert
        assertEquals(0, bookList.size());
        
    }
    
    @Test
    public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
        Catalogue catalogue = new Catalogue();
        catalogue.setReadItemCommand(mockReadItem);
        
        catalogue.getAllBooks();

        Mockito.verify(mockReadItem, Mockito.times(1)).readAll();
    }
    
    public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
        //code
    }

 

/*
    Arrange
    o    You will need a Catalogue object
    o    You will need a mock ReadItemCommandObject
    o    You will need to inject your mock ReadItemCommand into your Catalogue object
    Act
    o    Call getAllBooks() method of your catalogue. You can ignore its return value.
    Assert
    o    Verify that the readAll() method of ReadItemCommand is called exactly once, with no arguments
*/

 

 

 

}