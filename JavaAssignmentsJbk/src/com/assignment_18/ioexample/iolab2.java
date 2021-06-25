package com.assignment_18.ioexample;

import java.io.FileOutputStream;
import java.io.IOException;

public class iolab2 {
public static void main(String[] args) {
	try{
		String path="D:\\notes\\abc.txt";
		FileOutputStream fo=new FileOutputStream(path);
		String s="java by kiran";
		byte b[]=s.getBytes();
		fo.write(b);
		System.out.println("sucesssfully written");
		fo.close();
	}
	catch(IOException ee){
		
	}
}
}
