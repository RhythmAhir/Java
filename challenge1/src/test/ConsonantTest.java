package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Consonant;

class ConsonantTest {

	@Test
	void test() {
		Consonant con = new Consonant(); 
		
		con.setConsonant("any LINE given");
		
		int total = con.getConsonant();
		
		//Assert
		assertEquals(total, 7);
	}

}
