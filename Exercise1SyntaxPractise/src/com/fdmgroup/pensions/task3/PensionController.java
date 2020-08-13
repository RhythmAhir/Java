package com.fdmgroup.pensions.task3;

public class PensionController {
	public void handlePensions(Person[] people) {
		PensionLogic pensionable = new PensionLogic();
		View eligible = new View();
		
		for (int i=0; i < people.length; i++) {
			if (pensionable.isPensionable(people[i], "2014")) {
				eligible.printEligible(people[i]);
			} else {
			eligible.printIneligible(people[i]);
			}
		}
	}
}