package summer16;

public class StudentUS {
    private int id;
    private BirthDate dob;
    
    public StudentUS(int ssn,  int year, int month, int day) {
        id = ssn; 
        dob= new BirthDate(year, month, day);
    }  
    
    public int getId() {  
        return id;  
    }
    
    public BirthDate getBirthDate() {
         return dob; 
     }
}
