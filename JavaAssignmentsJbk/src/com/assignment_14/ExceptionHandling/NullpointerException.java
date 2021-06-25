package com.assignment_14.ExceptionHandling;

public class NullpointerException {
public static void main(String[] args) {
	try{
		String str=null;
		System.out.println(str.length());
	} catch(NullPointerException np){
		System.out.println("Null pointer exception");
		System.out.println("Now go on");
	}
}
}
