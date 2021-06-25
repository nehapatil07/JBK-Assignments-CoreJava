package com.assignment_14.ExceptionHandling;

public class eg6_object {
public static void main(String[] args) {
	try{
	eg6 aa=new eg6();
	aa.mymethod(1);
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
