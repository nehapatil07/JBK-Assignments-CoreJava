package com.assignment_8.inheritance;

public class maruti800 extends maruti {
public maruti800(){
	System.out.println("constructor of maruti800");
}
public void speed(){
	System.out.println("speed:80kmph");
}
public static void main(String[] args) {
	maruti800 aa=new maruti800();
	aa.vehicletype();
	aa.brand();
	aa.speed();
}


}
