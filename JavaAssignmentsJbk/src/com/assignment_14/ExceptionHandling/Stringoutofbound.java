package com.assignment_14.ExceptionHandling;

public class Stringoutofbound {
public static void main(String[] args) {
	try{
		String str="EasyStepsToBuildWebsite";
		System.out.println(str.length());
		char c=str.charAt(50);
		//c=str.charAt(40);
		System.out.println(c);
	} catch (StringIndexOutOfBoundsException e) {
		System.out.println("String Index Out Of Bounds Exception");
	}
}
}
