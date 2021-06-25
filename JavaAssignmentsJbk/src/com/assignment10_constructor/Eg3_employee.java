package com.assignment10_constructor;

public class Eg3_employee {
int empID;
String empName;
Eg3_employee(int id, String name){
	this.empID=id;
	this.empName=name;
}
void info(){
	System.out.println("id: "+empID+" name: "+empName);
}
public static void main(String[] args) {
	Eg3_employee ee=new Eg3_employee(100, "ravi");
	Eg3_employee ee1=new Eg3_employee(200, "ravin");
	ee.info();
	ee1.info();
	
}
}
