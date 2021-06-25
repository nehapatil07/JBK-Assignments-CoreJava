package com.assignment_14.ExceptionHandling;

public class MyException extends Exception {
String str;
MyException(String str2){
	str=str2;
}
public String tostring(){
	return("Output string="+str);
}
}
