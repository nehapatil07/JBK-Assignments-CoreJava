package com.assignment_12.abstraction;

public class vehicle implements moveable {
public void move(){
	System.out.println("avg speed is "+avgspeed);
}
public static void main(String[] args) {
	vehicle vv=new vehicle();
	vv.move();
}
}
