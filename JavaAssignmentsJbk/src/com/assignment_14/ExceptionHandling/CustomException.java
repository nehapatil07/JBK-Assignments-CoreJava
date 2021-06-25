package com.assignment_14.ExceptionHandling;

public class CustomException {
public static void main(String[] args) {
	try{
		throw new MyException("custom");
	} catch(MyException e){
		System.out.println("hi, this is my catch block");
		System.out.println(e);
	}
}
}
