package com.assignment_14.ExceptionHandling;

public class eg5 {
	public static void throwMethod() throws NullPointerException {
	System.out.println("inside throws method");
	throw new NullPointerException("demo");
}
	public static void main(String[] args) {
		try{
			throwMethod();
		} catch (NullPointerException e) {
			System.out.println("Exception get caught"+e);
		}
	}
}
