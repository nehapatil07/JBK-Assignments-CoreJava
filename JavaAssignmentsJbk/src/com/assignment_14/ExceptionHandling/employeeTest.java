package com.assignment_14.ExceptionHandling;

public class employeeTest {
static void employeeAge(int age) throws MyOwnException{
	if(age<0){
		throw new MyOwnException("age cant be less than zero");
	} else{
		System.out.println("Input is valid");
	}
}
public static void main(String[] args) {
	try{
		employeeAge(-2);
	} catch(MyOwnException e){
		e.printStackTrace();
	}
}
}
