package com.assignment_14.ExceptionHandling;

public class eg9 {
static void checkEligibility(int age, int wt){
	if (age<12 && wt<40){
		throw new ArithmeticException("student is not eligible for registration");
	} else{
		System.out.println("valid entry");
	}
}
public static void main(String[] args) {
	System.out.println("Welcome to the registration process");
	checkEligibility(10, 39);
	System.out.println("have a nice day");
}
}
