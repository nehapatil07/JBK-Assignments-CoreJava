package com.assignment_12.abstraction;

public class eg4_test extends eg4 {
String name;
void getval(String name){
	this.name=name;
}
void display(){
	System.out.println("Hello"+name);
}
}
