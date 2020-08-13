package com.fdmgroup.tdd.groupcontroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class GroupControllerServiceTest {
	
    @Mock
	static
    ReadItemCommand mockReadItem;
    
    @BeforeEach
    public void setupClass()
    {
   mockReadItem = Mockito.mock(ReadItemCommand.class);
    }
 
	
	@Test
	void sizetest() {
		GroupControllerService con = new GroupControllerServiceImpl(); 
		 con.setAllTrainees(mockReadItem); 
        
        //Act
        Map<String, Trainee> m = con.getAllTrainees();
        
        //Assert
        assertEquals(0, m.size());
       	}
	
	@Test
	void removetest() {
		GroupControllerService con = new GroupControllerServiceImpl(); 
		 con.setAllTrainees(mockReadItem); 
        
        //Act
        con.removeTraineeByUsername("Rhythm");
        
        //Assert
        Mockito.verify(mockReadItem, Mockito.times(1)).readAll();
       	}
	@Test
	void addtest() {
		GroupControllerService con = new GroupControllerServiceImpl(); 
		 con.setAllTrainees(mockReadItem); 
        Trainee Rhythm = new Trainee();
        //Act
        con.addTrainee(Rhythm);;
        
        //Assert
        Mockito.verify(mockReadItem, Mockito.times(1)).readAll();
       	}
	

}
