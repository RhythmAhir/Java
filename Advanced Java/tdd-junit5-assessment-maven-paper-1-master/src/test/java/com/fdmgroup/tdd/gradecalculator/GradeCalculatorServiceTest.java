package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GradeCalculatorServiceTest {

	@Test
	void test() {
		GradeCalculatorService con = new GradeCalculatorServiceImpl(); 
		

		String total = con.getClassification(80.0);
		
		//Assert
		assertEquals(total, "merit");
	}
	
}
