package com.assignment_7.string;

public class index_of {
public static void main(String[] args) {
	String s1="this is example of index";
	int index1=s1.indexOf("is");
	int index2=s1.indexOf("example");
	System.out.println(index1+" "+index2);;
	
	int index3=s1.indexOf("example", 4);
	System.out.println(index3);
	int index4=s1.indexOf('s');
	System.out.println(index4);
}
}
