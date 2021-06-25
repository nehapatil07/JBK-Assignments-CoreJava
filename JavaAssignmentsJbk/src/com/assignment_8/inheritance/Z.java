package com.assignment_8.inheritance;

public class Z extends Y {
public void methodZ(){
	System.out.println("class z method");
}

public static void main(String[] args) {
	Z zz=new Z();
	zz.methodx();
	zz.methodY();
	zz.methodZ();
}
}
