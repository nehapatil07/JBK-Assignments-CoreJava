package com.assignment_7.string;

public class equals_ignore {
public static void main(String[] args) {
	String s1="Java by kiran";
	String s2="Java by kiran";
	String s3="JAVA BY KIRAN";
	String s4="java_by_kiran";
	
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.equalsIgnoreCase(s3));
	System.out.println(s1.equalsIgnoreCase(s3));
	System.out.println(s1.equalsIgnoreCase(s4));
}
}
