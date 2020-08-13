package com.fdmgroup.pensions.task3;

public class PensionLogic {
	public boolean isPensionable(Person person, String year) {
		int year1 = Integer.parseInt(person.getDateOfBirth().substring(6));
		int year2 = Integer.parseInt(year);
		
		if(year2 - year1 >= 65)
			return true;
		return false;
	}
}
