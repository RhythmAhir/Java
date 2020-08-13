package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Consonant;
import main.Lunar;

class LunarTest {

	@Test
	void test() {
		Lunar con = new Lunar(); 
		
		con.setLunar(7,8);
		
		int num = con.getLunar();
		
		//Assert
		assertEquals(num, 8);	
		}

	@Test
	void test2() {
		Lunar con = new Lunar(); 
		
		con.setLunar(234,180);
		
		int num = con.get2Lunar();
		
		//Assert
		assertEquals(num, 284);	
		}


}
