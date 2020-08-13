package com.fdmgroup.fizzbuzz.task2;

public class FizzBuzzRunner {
	public void fizzBuzz(int number){ 
		//code 
for(number = 1; number<=100; number++) {
			
			if (fizzbuzz(number)==true) {
				System.out.println("FizzBuzz");
			}else if(fizz(number)==true) {
				System.out.println("Fizz");
			}
			else if(buzz(number)==true) {
				System.out.println("Buzz");
			} else {
				System.out.println(number);
			}
		}

		}
	private boolean fizz(int num) {
		if(num%3==0) { 
		return true;}else {
			return false;
		}
	}
	private boolean buzz(int num) {
		if(num%5==0) { 
		return true;}else {
			return false;
		}
	}
	private boolean fizzbuzz(int num) {
		if(num%3==0 && num%5==0) { 
		return true;}else {
			return false;
		}
	}

}
