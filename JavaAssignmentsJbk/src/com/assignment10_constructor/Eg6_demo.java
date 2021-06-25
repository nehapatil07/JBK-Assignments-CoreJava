package com.assignment10_constructor;

public class Eg6_demo {
int value1;
int value2;

Eg6_demo(){
	value1=10;
	value2=20;
	System.out.println("inside first constructor");
}
Eg6_demo(int a){
	value1=a;
	System.out.println("inside second constructor");
}
Eg6_demo(int a, int b){
	value1=a;
	value2=b;
	System.out.println("inside third constructor");
}
public void display(){
	System.out.println("value1=="+value1);
	System.out.println("value2=="+value2);
}
public static void main(String[] args) {
	Eg6_demo d1=new Eg6_demo();
	Eg6_demo d2=new Eg6_demo(5);
	Eg6_demo d3=new Eg6_demo(20,30);
	d1.display();
	d2.display();
	d3.display();
	
	
}
}
