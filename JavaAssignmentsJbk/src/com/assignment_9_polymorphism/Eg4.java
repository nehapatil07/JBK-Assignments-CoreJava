package com.assignment_9_polymorphism;

public class Eg4 {
String name;
int age;
String email;
public void setdata(String name, int age){
	this.name=name;
	this.age=age;
}
public void setdata(String name, int age, String email){
	this.name=name;
	this.age=age;
	this.email=email;
}
public void display(){
	System.out.println("Name is>> "+name);
	System.out.println("age is>> "+age);
	System.out.println("email id is>> "+email);	
}
public static void main(String[] args) {
	Eg4 aa=new Eg4();
	aa.setdata("neha", 23);
	aa.display();
	Eg4 aa1=new Eg4();
	aa1.setdata("abc", 56, "abc@gmail.com");
	aa1.display();
}
}
