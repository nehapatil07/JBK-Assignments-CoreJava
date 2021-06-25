package com.assignment_18.ioexample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioloab3 {
public static void main(String[] args) {
	try{
		String srcpath="E:\\WorkSpace3\\IOassignment\\src\\com\\jbk\\ioexample\\ioloab3.java";
		String despath="D:\\notes\\LabProgram3.txt";
		FileInputStream fis=new FileInputStream(srcpath);
		FileOutputStream fos=new FileOutputStream(despath);
		int i=0;
		while((i=fis.read())!=-1){
			fos.write(i);
		}
		fis.close();
	} catch(IOException ee )
	{
		ee.printStackTrace();
	}
}
}
