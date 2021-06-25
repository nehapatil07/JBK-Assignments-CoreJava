package com.assignment_9_polymorphism;

public class Eg6_subclass extends Eg6_bindDynamic{
void display (String str){
	super.display(str);
	if(val==null){
		str="Derived class function".concat(str);
		System.out.println(str);
	}
}
}
