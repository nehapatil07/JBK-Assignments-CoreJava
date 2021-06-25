package com.assignment_18.ioexample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class IOlab5 {
public static void main(String[] args) {
	try{
	FileInputStream fis=new FileInputStream("D:\\notes\\abc.txt");
	BufferedInputStream bst=new BufferedInputStream(fis);
	int i=0;
	while((i=bst.read())!=-1){
		System.out.println((char)i);
	}
	} catch(Exception e){
		e.printStackTrace();
	}
}
}
