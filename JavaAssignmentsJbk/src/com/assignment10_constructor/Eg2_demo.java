package com.assignment10_constructor;

public class Eg2_demo {
int value1;
int value2;
Eg2_demo(){
	value1=10;
	value2=20;
	System.out.println("inside constructor");
}
public void display(){
	System.out.println("value 1 is>>"+value1);
	System.out.println("value 2 is>>"+value2);
}
public static void main(String[] args) {
	Eg2_demo dd=new Eg2_demo();
	dd.display();
}
}