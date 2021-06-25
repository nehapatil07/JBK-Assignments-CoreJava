package com.assignment_12.abstraction;

public class eg3_result extends eg3_test {
String name, gender,city, country;
void getname(String name){
	this.name=name;
}
void getgender(String gender){
	this.gender=gender;
}
void getcity(String city){
	this.city=city;
}
void getcountry(String country){
	this.country=country;
}
void display(){
	System.out.println("Name:"+name);
	System.out.println("Gender:"+gender);
	System.out.println("City:"+city);
	System.out.println("Country:"+country);
}
}
