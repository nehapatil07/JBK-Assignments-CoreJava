package com.assignment_18.ioexample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class eg4 {
public static void main(String[] args) {
	FileOutputStream fos=null;
	File file;
	String mycontent="this is my data"+" Which needs to be written";
	try{
		file=new File("E:/nsp.txt");
		fos=new FileOutputStream(file);
		if(!file.exists()){
			file.createNewFile();
		}
		byte[] bytesarray=mycontent.getBytes();
		fos.write(bytesarray);
		fos.flush();
		System.out.println("file written successfully");
	} catch(IOException io){
		io.printStackTrace();
	} finally{
		try{
			if(fos!=null){
				fos.close();
			}
		} catch(IOException ee){
			System.out.println("Error in closing stream");
		}
	}
	
}
}
