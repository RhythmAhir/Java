import java.util.ArrayList;
 
public class Catalogue {
     ReadItemCommand readItemCommand;
     
     public ArrayList<Book> getAllBooks() {
    	 readItemCommand.readAll();
         return new ArrayList<Book>();
     }

 

    public void setReadItemCommand(ReadItemCommand readItemCommand) {
        // TODO Auto-generated method stub
        this.readItemCommand = readItemCommand;
    }
    
    public static void removeBookFromCatalogue(int ISBN) {
        
    }
}

