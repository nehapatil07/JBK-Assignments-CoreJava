package com.assignment_12.abstraction;

public class tyre implements eg8,rollable {
int width;

public boolean ismoveable(){
	return true;
}
public boolean isrollable(){
	return true;
}
public static void main(String[] args) {
	tyre rr=new tyre();
	System.out.println(rr.ismoveable());
	System.out.println(rr.isrollable());
}
}
