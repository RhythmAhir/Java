package com.fdmgroup.student;

import org.springframework.stereotype.Component;

@Component
public class bike implements Vehicle {

	public void drive() {
		System.out.println("Riding");
	}
}
