package com.assignment11.static_final;

public class eg3 {
public static void copyArg(String str1, String str2){
	str2=str1;
	System.out.println("first string arg is >>"+str1);
	System.out.println("second string arg is >>"+str2);
}
public static void main(String[] args) {
	eg3.copyArg("ABC", "DEF"); //frst method to call stati method
	copyArg("XYZ", "askfk");// second methdo to call static method
}
}
