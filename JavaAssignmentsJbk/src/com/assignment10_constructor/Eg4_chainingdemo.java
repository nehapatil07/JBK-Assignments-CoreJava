package com.assignment10_constructor;

public class Eg4_chainingdemo {
public Eg4_chainingdemo(){
	System.out.println("default constructor");
}
public Eg4_chainingdemo(String str){
	this();
	System.out.println("parameterized constructor with single parameter");
}
public Eg4_chainingdemo(String str, int num){
this("Hello");
System.out.println("parameterized constructor with double arg");
}
public Eg4_chainingdemo(int num1, int num2, int num3){
this("Hello",3);
System.out.println("parameterized constructor with three arg");
}

public static void main(String[] args) {
	Eg4_chainingdemo cc=new Eg4_chainingdemo(5,5,15);
	
}
}
