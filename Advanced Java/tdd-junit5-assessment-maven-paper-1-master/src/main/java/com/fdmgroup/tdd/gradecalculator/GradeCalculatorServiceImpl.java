package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculatorServiceImpl implements GradeCalculatorService {

	@Override
	public String getClassification(double mark) {
		// TODO Auto-generated method stub
		if(mark >= 90) {
			return "distinction";
		}else if(mark >= 80) {
			return "merit";
		} else if(mark >= 75) {
			return "pass";
		}else {
			return "fail";
		}
	}


}
