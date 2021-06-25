package com.assignment_14.ExceptionHandling;

public class NumFormat {
public static void main(String[] args) {
	try{
		int num=Integer.parseInt("XYZ");
		System.out.println(num);
	} catch(NumberFormatException nf){
		System.out.println("Number format exception occured");
	}
}
}
